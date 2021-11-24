package io.example.movieinfoservice.models;

public class Movie {
    private String MovieId;
    private String name;
    private String description = "This is good movie";

    public Movie(String movieId, String name) {
        this.MovieId = movieId;
        this.name = name;
    }

    public Movie(String movieId) {
    }

    public String getMovieId() {
        return MovieId;
    }

    public void setMovieId(String movieId) {
        this.MovieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
