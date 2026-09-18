package com.example.AccioNews.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

public class NewsService {

    @Autowired
    NewsService newsService;

}
public Object getNewsByCountry( String country, String apiKey) {
    String url = prepareUrl()
}