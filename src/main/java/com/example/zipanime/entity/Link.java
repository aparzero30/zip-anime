package com.example.zipanime.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {
    private String self;
    private String related;

    public String getSelf() {
        return self;
    }

    public String getRelated() {
        return related;
    }
}