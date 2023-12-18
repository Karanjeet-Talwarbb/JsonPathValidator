package org.example;

import com.jayway.jsonpath.JsonPath;
import io.vertx.core.json.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        JsonAdapter root=new JsonAdapter(contextObj.getJsonObject("input"));
        return dfs(root,"");
    }

    private JsonAdapter dfs(JsonAdapter node, String localContext){
         JsonAdapterIterator itr=new JsonAdapterIterator(node);
         String newLocalContext=getNewLocalContext(node,localContext);
         JsonAdapter nodeCopy=node.getNewJsonAdapter();
         while(itr.hasNext()){
             Object curKey=itr.next();
//             if(itr.isValidIteration()==false){
//                 continue;
//             }
             Object curValue=node.getByKey(curKey);
             boolean isNotVal=curValue instanceof List || curValue instanceof Map;
             Object valueToPut=(isNotVal)?dfs(new JsonAdapter(curValue),newLocalContext).getDelegate():
                     checkValue(curValue,newLocalContext);
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
             JsonObject contextObj=new JsonObject(contextObjectAsString);
             JsonObject outputObj=contextObj.getJsonObject("output");
             jsonPath=jsonPath.replace("$.local_context",localContext);
             Object rv= JsonPath.read(outputObj.toString(),jsonPath);
             return rv;
         }
         catch (Exception e){
             return e.toString();
         }

     }


}
