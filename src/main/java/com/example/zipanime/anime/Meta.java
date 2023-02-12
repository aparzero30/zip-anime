package com.example.zipanime.anime;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.awt.*;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta {

    private Map<String, Dimension> dimensions;

    public Map<String, Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(Map<String, Dimension> dimensions) {
        this.dimensions = dimensions;
    }
}