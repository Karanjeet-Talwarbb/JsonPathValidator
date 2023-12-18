package org.example;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonAdapter {
    private boolean isArray;
    private JsonArray jsonArray;
    private JsonObject jsonObject;

    private void JsonList(List jsonArray) {
        this.isArray = true;
        this.jsonArray = new JsonArray(jsonArray);
    }

    private void JsonMap(Map jsonObject) {
        this.isArray = false;
        this.jsonObject = new JsonObject(jsonObject);
    }

    private void setFields(JsonAdapter jsonAdapter) {
        this.isArray = jsonAdapter.isArray;
        if (isArray)
            this.jsonArray = new JsonArray(jsonAdapter.jsonArray.toString());
        else
           this.jsonObject = new JsonObject(jsonAdapter.jsonObject.toString());

    }

    public JsonAdapter(Object obj) {
        if (obj instanceof JsonAdapter) {
            setFields((JsonAdapter) obj);
        }
        else if (obj instanceof JsonObject) {
            this.isArray = false;
            this.jsonObject = (JsonObject) obj;
        }
        else if (obj instanceof JsonArray) {
            this.isArray = true;
            this.jsonArray = (JsonArray) obj;
        }
        else if (obj instanceof List) {
            JsonList((List) obj);
        }
        else if (obj instanceof Map) {
            JsonMap((Map) obj);
        }
        else{
            return;
        }
    }
    public JsonAdapter getNewJsonAdapter(){
        JsonAdapter jsonAdapter= new JsonAdapter(this);
        if(jsonAdapter.isArray) {
            jsonAdapter.jsonArray = new JsonArray("[]");
            return jsonAdapter;
        }
        jsonAdapter.jsonObject=new JsonObject("{}");
        return jsonAdapter;
    }

    private Iterator<Object> getJsonArrayIterator() {
        return jsonArray.stream()
                        .iterator();
    }

    private Iterator<String> getJsonObjectIterator() {
        return jsonObject.getMap()
                         .keySet()
                         .iterator();
    }

    public Iterator<? extends Object> getIterator() {
        if (isArray) {
            return getJsonArrayIterator();
        }
        return getJsonObjectIterator();
    }

    public Set<String> getKeys() {
        if (isArray)
            return new HashSet<>();
        return jsonObject.fieldNames();
    }

    public Object getByKey(Object key) {
        if (isArray)
            return key;
        return jsonObject.getMap()
                         .get(key);
    }

    public String getString(String key) {
        if (isArray)
            return null;
        return jsonObject.getString(key);
    }
    public void put(Object key,Object value){
        if(isArray){
          jsonArray.add(value);
        }
        if(key instanceof String){
            jsonObject.put((String) key,value);
        }
    }
    public Object getDelegate(){
        if(isArray){
            return jsonArray;
        }
        return jsonObject;
    }
}
