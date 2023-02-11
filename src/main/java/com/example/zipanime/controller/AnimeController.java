package com.example.zipanime.controller;

import com.example.zipanime.anime.Anime;
import com.example.zipanime.entity.Category;
import com.example.zipanime.service.AnimeService;
import com.example.zipanime.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController("/anime")
public class AnimeController {

    @Autowired
    private AnimeService animeService;




    @GetMapping("/trendingAnime")
    public List<Anime> getTrendingAnime() throws IOException {
       return animeService.getTrendingAnime();

    }




}