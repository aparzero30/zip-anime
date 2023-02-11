package com.example.zipanime.anime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Link {
        private String self;


        private String related;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getRelated() {
            return related;
        }

        public void setRelated(String related) {
            this.related = related;
        }
    }

