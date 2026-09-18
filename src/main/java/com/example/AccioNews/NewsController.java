
package com.example.AccioNews.controller;

import com.example.AccioNews.dto.NewsResponse;
import com.example.AccioNews.service.NewsService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/country")
    public NewsResponse getNewsByCountry(@RequestParam("country") String country,
                                         @RequestParam("api-key") String apiKey) {
        return newsService.getNewsByCountry(country,apiKey);
    }

}
