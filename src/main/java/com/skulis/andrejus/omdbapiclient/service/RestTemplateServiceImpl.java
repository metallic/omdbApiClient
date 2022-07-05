package com.skulis.andrejus.omdbapiclient.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skulis.andrejus.omdbapiclient.config.OmdbApiClientProperties;
import com.skulis.andrejus.omdbapiclient.model.Episode;
import com.skulis.andrejus.omdbapiclient.model.Season;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class RestTemplateServiceImpl implements RestTemplateService {

    private final RestTemplate restTemplate;
    private final OmdbApiClientProperties clientProperties;
    private final ObjectMapper objectMapper;

    private static final Logger LOG = LoggerFactory.getLogger(RestTemplateServiceImpl.class);

    @Autowired
    public RestTemplateServiceImpl(RestTemplate restTemplate, OmdbApiClientProperties clientProperties, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;
        this.clientProperties = clientProperties;
        this.objectMapper = objectMapper;
    }
    @Override
    public Season getSeasonNumberForMovieId(String seasonNumber, String movieId) {
        LOG.debug("GET getEpisodesForSeason");
        // http://www.omdbapi.com/?i=tt0944947&Season=1
        Season response = restTemplate.getForObject('/' + "?apikey=" + clientProperties.getApikey()+ "&i=tt0944947&Season=1", Season.class);
        return response;
    }
}
