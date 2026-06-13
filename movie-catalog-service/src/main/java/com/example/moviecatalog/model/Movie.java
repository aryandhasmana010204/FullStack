package com.example.moviecatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "movies")
public class Movie {
    @Id
    private String id;
    private String title;
    private List<String> genre;
    private Double rating;
    private String language;
    private Integer duration;
    private LocalDate releaseDate;
    private String posterUrl;

    public Movie() {}

    public Movie(String id, String title, List<String> genre, Double rating, String language, Integer duration, LocalDate releaseDate, String posterUrl) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.language = language;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.posterUrl = posterUrl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<String> getGenre() { return genre; }
    public void setGenre(List<String> genre) { this.genre = genre; }
    public Double getRating() { return rating; }
    public void setRating(Double rating) { this.rating = rating; }
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }
    public LocalDate getReleaseDate() { return releaseDate; }
    public void setReleaseDate(LocalDate releaseDate) { this.releaseDate = releaseDate; }
    public String getPosterUrl() { return posterUrl; }
    public void setPosterUrl(String posterUrl) { this.posterUrl = posterUrl; }
}
