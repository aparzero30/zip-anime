package com.example.zipanime.anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class AnimeCharacters {

    private Link links;

    public Link getLinks() {
        return links;
    }

    public void setLinks(Link links) {
        this.links = links;
    }
}
