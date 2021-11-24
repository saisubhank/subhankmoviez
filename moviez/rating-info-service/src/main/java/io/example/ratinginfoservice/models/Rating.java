package io.example.ratinginfoservice.models;

public class Rating {
    private String movieId;
    private int rating = 10;
    public Rating(String movieId) {

    }
    public Rating (String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public Rating(String movieId, String test_name) {
    }

    public String getMovieId() {
        return movieId;

    }
    public void setMovieId(String movieId) {
        this.movieId = movieId; }

    public int getRating() {
        return rating;

    }
    public void setRating (int rating) {
        this.rating = rating;
    }



}
