package com.github.mob41.osums.indexing;

public class IndexingProgressAdapter extends IndexingProgressHandler {

    public IndexingProgressAdapter() {
        
    }

    @Override
    public boolean onStart() {
        return true;
    }

    @Override
    public boolean onPause() {
        return true;
    }

    @Override
    public boolean onError() {
        return true;
    }

    @Override
    public boolean onComplete() {
        return true;
    }

}
