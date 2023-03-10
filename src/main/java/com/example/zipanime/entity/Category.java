package com.example.zipanime.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Service;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
    private String id;
    private String type;
    private Link links;
    private Attributes attributes;
    private Relationships relationships;

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Link getLinks() {
        return links;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Relationships getRelationships() {
        return relationships;
    }
}