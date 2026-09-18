package com.example.AccioNews.service;

import com.example.AccioNews.dto.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    @Autowired
    private RestTemplate restTemplate;

    public NewsResponse getNewsByCountry(String country, String apiKey) {
        String url = prepareUrl(country, apiKey);
        return restTemplate.getForObject(url, NewsResponse.class);
    }

    private String prepareUrl(String country, String apiKey) {
        return "https://newsapi.org/v2/top-headlines?country=" + country + "&apiKey=" + apiKey;
    }
}