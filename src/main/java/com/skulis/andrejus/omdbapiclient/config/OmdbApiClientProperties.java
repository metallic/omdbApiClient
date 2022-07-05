package com.skulis.andrejus.omdbapiclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "omdbapiclient")
public class OmdbApiClientProperties {

    private String host;
    private String apikey;

    public OmdbApiClientProperties() { }

    public String getHost() { return host; }

    public void setHost(String host) { this.host = host; }

    public String getApikey() { return apikey; }

    public void setApikey(String apikey) { this.apikey = apikey; }
}
