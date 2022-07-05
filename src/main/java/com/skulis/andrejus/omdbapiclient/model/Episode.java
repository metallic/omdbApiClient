package com.skulis.andrejus.omdbapiclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

//        "Title": "Winter Is Coming",
//        "Released": "2011-04-17",
//        "Episode": "1",
//        "imdbRating": "N/A",
//        "imdbID": "tt1480055"

public class Episode extends AbstractJsonMapping implements Serializable {

    @JsonProperty("Title")
    private String title = "";
    @JsonProperty("Released")
    private String releasedDate = "";
    @JsonProperty("Episode")
    private String episodeNumber = "";
    @JsonProperty("imdbRating")
    private String imdbRating = "";
    @JsonProperty("imdbID")
    private String imdbID = "";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(String releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(String episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    public String getImdbID() {
        return imdbID;
    }

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }
}
