package com.example.zipanime.service;

import com.example.zipanime.entity.Category;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryService {

    private RestTemplate restTemplate;

    @Autowired
    public CategoryService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<Category> getCategory() throws IOException {
        List<Category> categories = new ArrayList<>();

        URL url = new URL("https://kitsu.io/api/edge/categories");
        URLConnection connection = url.openConnection();
        InputStream response = connection.getInputStream();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode root = objectMapper.readTree(response);
        JsonNode dataNode = root.path("data");
        ObjectMapper mapper = new ObjectMapper();

        for (JsonNode categoryNode : dataNode) {
            Category category = mapper.readValue(categoryNode.traverse(), Category.class);
            categories.add(category);
        }

        return categories;
    }
}
