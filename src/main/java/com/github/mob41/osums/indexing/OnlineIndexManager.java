package com.github.mob41.osums.indexing;

import org.json.JSONArray;
import org.json.JSONObject;

public class OnlineIndexManager {
    
    private static final String RANKED_INDEX = "https://osu.ppy.sh/p/beatmaplist?l=1&r=0&q=&g=0&la=0&ra=&s=4&o=1&m=-1&page=";

    private JSONObject indexJson;
    
    public OnlineIndexManager() {
        indexJson = new JSONObject();
        indexJson.put("indexes", new JSONArray());
    }
    
    public boolean startIndexing(){
        return startIndexing(new IndexingProgressAdapter());
    }
    
    public boolean startIndexing(IndexingProgressHandler handler){
        
        return false;
    }

}
