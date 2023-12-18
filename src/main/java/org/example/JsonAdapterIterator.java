package org.example;

import io.vertx.core.json.JsonObject;

import java.util.Iterator;

public class JsonAdapterIterator {
    JsonAdapter jsonAdapter;
    private Iterator<?> itr;
    private Object curVal;
    public JsonAdapterIterator(JsonAdapter jsonAdpater){
        this.jsonAdapter=jsonAdpater;
        this.itr= jsonAdapter.getIterator();
        curVal=null;

    }
    public boolean hasNext(){
        return itr.hasNext();
    }
    public Object next(){
        return curVal=itr.next();
    }
    public boolean isValidIteration(){
        String baseContext="base_context";
        if(jsonAdapter.getDelegate() instanceof JsonObject && baseContext.equals(curVal)){
            return true;
        }
        return false;
    }
}
