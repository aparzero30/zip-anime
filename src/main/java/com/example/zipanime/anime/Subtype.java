package com.example.zipanime.anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public enum Subtype {
    ONA("Original Net Animation"),
    OVA("Original Video Animation"),
    TV("Television"),
    MOVIE("Movie"),
    MUSIC("Music"),
    SPECIAL("Special");

    private String description;

    Subtype(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}