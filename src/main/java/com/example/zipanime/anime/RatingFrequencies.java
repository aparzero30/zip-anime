package com.example.zipanime.anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;


@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingFrequencies {



    private HashMap<String, String> frequencies;

        /*public RatingFrequencies() {
            frequencies = new HashMap<>();
            frequencies.put("2", "");
            frequencies.put("3", "");
            frequencies.put("4", "");
            frequencies.put("5", "");
            frequencies.put("6", "");
            frequencies.put("7", "");
            frequencies.put("8", "");
            frequencies.put("9", "");
            frequencies.put("10", "");
            frequencies.put("11", "");
            frequencies.put("12", "");
            frequencies.put("13", "");
            frequencies.put("14", "");
            frequencies.put("15", "");
            frequencies.put("16", "");
            frequencies.put("17", "");
            frequencies.put("18", "");
            frequencies.put("19", "");
            frequencies.put("20", "");

        }*/

    public HashMap<String, String> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(HashMap<String, String>  frequencies) {
        this.frequencies = frequencies;
    }
}
