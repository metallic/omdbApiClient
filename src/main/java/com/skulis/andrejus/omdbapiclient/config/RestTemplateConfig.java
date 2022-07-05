package com.skulis.andrejus.omdbapiclient.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    private final OmdbApiClientProperties clientProperties;

    private static final Logger LOG = LoggerFactory.getLogger(RestTemplateConfig.class);

    @Autowired
    public RestTemplateConfig(OmdbApiClientProperties clientProperties) {
        this.clientProperties = clientProperties;
    }

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);

        return objectMapper;
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(objectMapper());
        return converter;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {

//        http://www.omdbapi.com/?i=tt3896198&apikey=88bf8909
        RestTemplate restTemplate =  builder
                .rootUri(clientProperties.getHost())
                .build();

        restTemplate.getMessageConverters().add(0, mappingJackson2HttpMessageConverter());

        return restTemplate;
    }

//    @Bean
//    public RestTemplate authenticationRestTemplate(RestTemplateBuilder builder) {
//
//        RestTemplate restTemplate =  builder
//                .rootUri(clientProperties.getHost() + '/' + clientProperties.getApiVersion())
//                .basicAuthentication(clientProperties.getUsername(), clientProperties.getPassword())
//                .build();
//
//        restTemplate.getMessageConverters().add(0, mappingJackson2HttpMessageConverter());
//
//        return restTemplate;
//    }
}

