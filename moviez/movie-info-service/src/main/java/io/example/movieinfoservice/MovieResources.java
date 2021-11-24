package io.example.movieinfoservice;


import io.example.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResources {
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        Movie movie= new Movie(movieId,"Testname");
        if (movieId.equals("Hero")) {
            movie.setDescription("junk movie");
        }
        else if (movieId.equals("sas")) {
            movie.setDescription("good to watch one time");
        }
        return movie;

    }
}
