package com.github.mob41.osums.io.beatmap;

import com.github.mob41.organdebug.exceptions.DebuggableException;

public class ResultBeatmap {
    
    private final int id;

    private final String artist;
    
    private final String title;
    
    private final String creator;
    
    private final String[] tags;
    
    private final int favourites;
    
    private final int plays;
    
    private final String beatmapUrl;
    
    private final String thumbUrl;
    
    public ResultBeatmap(int id, String artist, String title, String creator, String[] tags, int favourites, int plays, String beatmapUrl, String thumbUrl) {
        this.id = id;
        this.artist = artist;
        this.title = title;
        this.creator = creator;
        this.tags = tags;
        this.favourites = favourites;
        this.plays = plays;
        this.beatmapUrl = beatmapUrl;
        this.thumbUrl = thumbUrl;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    public String[] getTags() {
        return tags;
    }

    public int getFavourites() {
        return favourites;
    }

    public int getPlays() {
        return plays;
    }

    public String getBeatmapUrl() {
        return beatmapUrl;
    }
    
    public BeatmapPage getBeatmap(Osums osums) throws DebuggableException{
        return osums.getBeatmapInfo(this.beatmapUrl);
    }

    public int getId() {
        return id;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

}
