package org.example;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ContextPrep {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final String[] allowedKeys={"input_format","output_format","repeatable","bulk_input"};
    public static String prepareContext(String input) {
        JsonObject context = new JsonObject("{}");
        JsonObject inputOutput = new JsonObject(input);
        JsonObject inputContext = new JsonObject("{}");
        JsonObject outputContext = new JsonObject("{}");
        context = context.put("input", inputContext);
        context = context.put("output", outputContext);
        for (String task : inputOutput.fieldNames()) {
            JsonObject taskDetails = inputOutput.getJsonObject(task);
            inputContext = inputContext.put(task, new JsonObject("{}"));
            for (String key : taskDetails.fieldNames()) {
                if(Arrays.asList(allowedKeys).contains(key)==false){
                    continue;
                }
                if (key.equals("output_format")) {
                    JsonObject root = taskDetails.getJsonObject(key);
                    Object dummy = getDummy(root);
                    outputContext = outputContext.put(task, dummy);
                } else if (key.equals("input_format")) {
                    Object valToPut = taskDetails.getValue(key);
                    JsonObject temp=inputContext.getJsonObject(task);
                    temp=temp.put("fields", valToPut);
                } else {
                    JsonObject jsonObject = inputContext.getJsonObject("operations", new JsonObject("{}"));
                    if (jsonObject.containsKey(key) == false) {
                        jsonObject = jsonObject.put(key, taskDetails.getJsonObject(key));
                    } else {
                        JsonObject op = jsonObject.getJsonObject(key);
                        JsonArray ops = new JsonArray("[]");
                        ops.add(op);
                        ops.add(taskDetails.getJsonObject(key));
                        jsonObject = jsonObject.put(key, ops);
                    }
                    JsonObject temp=inputContext.getJsonObject(task);
                    temp.put("operations",jsonObject);
                }
            }

        }
        return context.toString();
    }


    private static Object getDummy(JsonObject node){
        if(node.containsKey("properties")){;
            return getDummy(node.getJsonObject("properties"));
        }
        if(node.containsKey("type")){
           return generateDummyValue(node);
        }
       return recurse(node);
    }
    private static Object recurse(JsonObject node){
        Set<String> keys=node.getMap()
                             .keySet();
        JsonObject temp=new JsonObject("{}");
        for(String key:keys){
            if(key.equals("type")){
                continue;
            }
            temp.put(key,getDummy(node.getJsonObject(key)));
        }
        return temp;
    }
    private static Object generateDummyValue(JsonObject root){
        String type=root.getString("type");
        switch (type) {
            case "string":
                return "";
            case "number":
            case "integer":
                return 0;
            case "boolean":
                return true;
            case "array":
                JsonArray temp=new JsonArray("[]");
                temp.add(getDummy(root.getJsonObject("items")));
                return temp;
            case "object":
                return recurse(root);
            default:
                return null;
        }
    }
}
