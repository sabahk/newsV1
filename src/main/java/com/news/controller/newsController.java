package com.news.controller;

import com.news.model.Everything;
import com.news.model.Source;
import com.news.model.TopHeadlines;
import com.news.service.newsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/newsV1")
public class newsController {
    @Autowired
    newsService ns;

    @GetMapping("/TopHeadlines/{key}/{value}")
    public TopHeadlines headlines(@PathVariable(required = false, name = "key") String key, @PathVariable(required = false, name="value") String value){
        return ns.getTopHeadlines(key, value);
    }

    @GetMapping("/SourceInfo")
    public Source sourceInfo(){
        return ns.getSourceInfo();
    }

    @GetMapping("/Everything/{q}")
    public Everything everything(@PathVariable("q") String q){
        return ns.getEverything(q);
    }

}
