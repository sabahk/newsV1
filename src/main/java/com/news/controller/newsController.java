package com.news.controller;

import com.news.model.TopHeadlines;
import com.news.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newsController {
    @Autowired
    newsService ns;

    @RequestMapping("/")
    public TopHeadlines headlines(){
        return ns.getTopHeadlines();
    }
}
