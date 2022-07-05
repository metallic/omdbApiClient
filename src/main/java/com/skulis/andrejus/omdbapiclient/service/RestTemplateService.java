package com.skulis.andrejus.omdbapiclient.service;

import com.skulis.andrejus.omdbapiclient.model.Episode;
import com.skulis.andrejus.omdbapiclient.model.Season;

import java.util.List;

public interface RestTemplateService {

    Season getSeasonNumberForMovieId(String seasonNumber, String movieId);

}