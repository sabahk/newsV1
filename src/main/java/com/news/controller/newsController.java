package com.news.controller;

import com.news.model.Source;
import com.news.model.TopHeadlines;
import com.news.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newsV1")
public class newsController {
    @Autowired
    newsService ns;

    @GetMapping("/TopHeadlines")
    public TopHeadlines headlines(){
        return ns.getTopHeadlines();
    }

    @GetMapping("/SourceInfo")
    public Source sourceInfo(){
        return ns.getSourceInfo();
    }
}
