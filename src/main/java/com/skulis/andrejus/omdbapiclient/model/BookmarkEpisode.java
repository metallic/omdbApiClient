package com.skulis.andrejus.omdbapiclient.model;

import javax.persistence.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//        "Title": "Winter Is Coming",
//        "Released": "2011-04-17",
//        "Episode": "1",
//        "imdbRating": "N/A",
//        "imdbID": "tt1480055"

@Entity
@Table
public class BookmarkEpisode {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String releasedDate;

    private String episodeNumber;

    private String imdbRating;

    private String imdbID;

    public BookmarkEpisode() { }

    public BookmarkEpisode(Long id, String title, String releasedDate, String episodeNumber, String imdbRating, String imdbID) {
        this.id = id;
        this.title = title;
        this.releasedDate = releasedDate;
        this.episodeNumber = episodeNumber;
        this.imdbRating = imdbRating;
        this.imdbID = imdbID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
