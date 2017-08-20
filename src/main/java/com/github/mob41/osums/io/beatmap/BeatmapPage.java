package com.github.mob41.osums.io.beatmap;

public interface BeatmapPage {

    public String getTitle();
    
    public String getArtist();
    
    public String getCreator();

    public String getSource();

    public String getGenre();

    public String getDwnUrl();

    public String getThumbUrl();

    public float getStarDifficulty();

    public int getBadRating();

    public int getGoodRating();
    
    public float getRating();

    public float getBpm();

    public float getSuccessRate();

    public String getOriginalUrl();
    
}
