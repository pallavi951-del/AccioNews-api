package com.example.AccioNews.response;


import lombok.Getter;
import lombok.Setter;

import java.util.List;



@Setter
@Getter
public class newsResponse {


   int totalResults;

   List<Article> article;


    public newsResponse() {
    }

}
