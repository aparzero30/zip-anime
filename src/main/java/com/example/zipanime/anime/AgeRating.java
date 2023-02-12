package com.example.zipanime.anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum AgeRating {
    G("General"),
    PG("Parental Guidance"),
    R("Restricted"),
    R18("Restricted 18+");

    private String description;

    AgeRating(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
