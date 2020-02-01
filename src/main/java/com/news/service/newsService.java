package com.news.service;

import com.news.model.Source;
import com.news.model.TopHeadlines;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class newsService {
    @Autowired
    RestTemplate restTemplate = new RestTemplate();
    String apiKey = "948a0a04f57542d3a422056d71be0ed0";


  public TopHeadlines getTopHeadlines(){
      return restTemplate.getForObject("https://newsapi.org/v2/top-headlines?country=us&apiKey=" + apiKey, TopHeadlines.class);
  }

  public Source getSourceInfo(){
    return restTemplate.getForObject("https://newsapi.org/v2/sources?apiKey=" + apiKey, Source.class);
  }




}
