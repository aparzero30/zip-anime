package com.example.zipanime.anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dimensions {
    private ImageSize tiny;
    private ImageSize small;
    private ImageSize medium;
    private ImageSize large;
}
