package com.example.AccioNews.Controller;


import com.example.AccioNews.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/news")
public class NewsController {

    @Autowired
     NewsService newsService1;

    @GetMapping
    public Object getNews(@RequestParam("api-key") String apiKey){

        return newsService1.getNews(apiKey);



    }


}
