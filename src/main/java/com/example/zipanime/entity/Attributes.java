package com.example.zipanime.entity;


public class Attributes {
    private String createdAt;
    private String updatedAt;
    private String title;
    private String description;
    private int totalMediaCount;
    private String slug;
    private boolean nsfw;
    private int childCount;

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalMediaCount() {
        return totalMediaCount;
    }

    public String getSlug() {
        return slug;
    }

    public boolean isNsfw() {
        return nsfw;
    }

    public int getChildCount() {
        return childCount;
    }
}