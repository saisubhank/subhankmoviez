package io.example.moviecatalogservice.resources;

import io.example.moviecatalogservice.models.Movie;
import io.example.moviecatalogservice.models.MovieRating;
import io.example.moviecatalogservice.models.Rating;
import io.example.moviecatalogservice.models.catalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{movieName}")
    public catalogItem getMovie(@PathVariable("movieName") String movieName) {
        RestTemplate restTemplate = new RestTemplate();
        Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + movieName, Movie.class);
        Rating rating = restTemplate.getForObject("http://localhost:8082/ratingdata/" + movieName, Rating.class);

        catalogItem ct = new catalogItem(movie.getName(), movie.getDescription(), rating.getRating());
        return ct;
    }

    @RequestMapping(value = "rating/{movieName}", method = RequestMethod.GET)
    public Rating getRatingByMovie(@PathVariable("movieName") String movieName) {
        RestTemplate restTemplate = new RestTemplate();
        //Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + movieName ,Movie.class);
        Rating rating = restTemplate.getForObject("http://localhost:8082/ratingdata/" + movieName, Rating.class);

        Rating ct = new Rating(rating.getMovieId(), rating.getRating());
        return rating;
    }

    @RequestMapping(value = "MovieRating/{movieName}", method = RequestMethod.GET)
    public MovieRating getMovieRatingByMovie(@PathVariable("movieName") String movieName) {
        RestTemplate restTemplate = new RestTemplate();
        Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + movieName, Movie.class);
        Rating rating = restTemplate.getForObject("http://localhost:8082/ratingdata/" + movieName, Rating.class);

        MovieRating mr = new MovieRating(movie.getMovieId(), rating.getRating());
        return mr;

    }
}