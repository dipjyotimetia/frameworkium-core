package com.frameworkium.integration.tfl.api.entities.JourneyPlanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class JourneyVector {
    public String from;
    public String to;
}
