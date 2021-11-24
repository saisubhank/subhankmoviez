package io.example.moviecatalogservice.models;

public class Movie {
    private String MovieId;
    private String name;
    private String description;

public Movie() {

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
