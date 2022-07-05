package com.skulis.andrejus.omdbapiclient.model;

//        Title: "Game of Thrones",
//        Season: "4",
//        totalSeasons: "8",
//        Episodes: []

import javax.persistence.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class Season {

    @JsonProperty("Title")
    private String movieTitle = "";
    @JsonProperty("Season")
    private String seasonNumber = "";
    @JsonProperty("totalSeasons")
    private String totalSeasons = "";

    @JsonProperty("Episodes")
    private Episode[] episodes;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(String seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public String getTotalSeasons() {
        return totalSeasons;
    }

    public void setTotalSeasons(String totalSeasons) {
        this.totalSeasons = totalSeasons;
    }

    public Episode[] getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Episode[] episodes) {
        this.episodes = episodes;
    }
}
