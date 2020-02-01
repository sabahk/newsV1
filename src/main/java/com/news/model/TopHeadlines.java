package com.news.model;

import java.util.List;

public class TopHeadlines {
    public List<Articles> getArticles() {
        return articles;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }

    List<Articles> articles;
}
