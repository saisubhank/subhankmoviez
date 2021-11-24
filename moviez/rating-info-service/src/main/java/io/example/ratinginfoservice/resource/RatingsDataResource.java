package io.example.ratinginfoservice.resource;

import io.example.ratinginfoservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingdata")

public class RatingsDataResource {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        Rating rating= new Rating(movieId,"Test name");

        if(movieId.equals("Hero")){
            rating.setRating(5);
        }
        else if(movieId.equals("sas")){
            rating.setRating(3);
        }
        return rating;


    }

}
