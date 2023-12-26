package org.example;

import com.jayway.jsonpath.JsonPath;
import io.vertx.core.json.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContextValidator {

     private String contextObjectAsString,responseObjectAsString;
     private static final String JSON_PATH_REGEX = "^\\$([.a-zA-Z0-9_]+|\\[[*0-9]+\\])*$";

    public static boolean isValidJsonPath(String jsonPath) {
        Pattern pattern = Pattern.compile(JSON_PATH_REGEX);
        Matcher matcher = pattern.matcher(jsonPath);
        boolean res=matcher.matches();
        return res;
    }
    public ContextValidator(String contextObjectAsString) {
        this.contextObjectAsString = contextObjectAsString;
        this.responseObjectAsString=contextObjectAsString;
    }
    public JsonAdapter validateContext(){
        JsonObject contextObj=new JsonObject(contextObjectAsString);
        JsonObject root=contextObj.getJsonObject("input");
        JsonObject completeValidation=new JsonObject("{}");
        for(String key:root.fieldNames()){
            JsonObject task=root.getJsonObject(key);
            JsonObject taskCheck=validateTask(task);
            completeValidation.put(key,taskCheck);
        }
        return new JsonAdapter(completeValidation);
    }
    private JsonObject validateTask(JsonObject task){
        JsonObject temp=new JsonObject("{}");
        if(task.containsKey("fields")){
            JsonAdapter fields=new JsonAdapter(task.getValue("fields"));
            JsonAdapter validateInput=dfs(fields);
            temp.put("fields",validateInput.getDelegate());
        }
        if(task.containsKey("operations")){
            JsonAdapter operations=new JsonAdapter(task.getValue("operations"));
            JsonAdapter validateOperations=dfs(operations,"");
            temp.put("operations",validateOperations.getDelegate());
        }
        return temp;
    }

    private JsonAdapter dfs(JsonAdapter node, String localContext){
         JsonAdapterIterator itr=new JsonAdapterIterator(node);
         String newLocalContext=getNewLocalContext(node,localContext);
         JsonAdapter nodeCopy=node.getNewJsonAdapter();
         while(itr.hasNext()){
             Object curKey=itr.next();
             Object curValue=node.getByKey(curKey);
             boolean isNotVal=curValue instanceof List || curValue instanceof Map;
             Object valueToPut=(isNotVal)?dfs(new JsonAdapter(curValue),newLocalContext).getDelegate():
                     checkValue(curValue,newLocalContext);
             nodeCopy.put(curKey,valueToPut);
         }
         return nodeCopy;
     }
    private JsonAdapter dfs(JsonAdapter node){
        JsonAdapterIterator itr=new JsonAdapterIterator(node);
        JsonAdapter nodeCopy=node.getNewJsonAdapter();
        while(itr.hasNext()){
            Object curKey=itr.next();
            Object curValue=node.getByKey(curKey);
            boolean isNotVal=curValue instanceof List || curValue instanceof Map;
            Object valueToPut=(isNotVal)?dfs(new JsonAdapter(curValue)).getDelegate():
                    checkValue(curValue);
            nodeCopy.put(curKey,valueToPut);
        }
        return nodeCopy;
    }
    private String getNewLocalContext(JsonAdapter node,String localContext){
         if(node.getKeys().contains("base_context")==false){
             return localContext;
         }
         String newLocalContext=node.getString("base_context");
         newLocalContext.trim().replaceAll("$.local_context",localContext);
         return newLocalContext;
     }
     private Object checkValue(Object val,String localContext){
         if(!(val instanceof String))
             return val;
         try{
             String jsonPath=(String)val;
             if(isValidJsonPath(jsonPath)==false){
                 return jsonPath;
             }
             return computeJsonPath(jsonPath,localContext);
         }
         catch (Exception e){
             return e.toString();
         }

     }
     private Object checkValue(Object val){
         if(!(val instanceof String))
             return val;
         try{
             String jsonPath=(String)val;
             if(isValidJsonPath(jsonPath)==false||jsonPath.contains("local_context")){
                 return jsonPath;
             }
             return computeJsonPath(jsonPath,"");
         }
         catch (Exception e){
             return e.toString();
         }
     }
     private Object computeJsonPath(String jsonPath,String localContext){
         JsonObject contextObj=new JsonObject(contextObjectAsString);
         JsonObject outputObj=contextObj.getJsonObject("output");
         jsonPath=jsonPath.replace("$.local_context",localContext);
         Object rv= JsonPath.read(outputObj.toString(),jsonPath);
         return rv;
     }
}
