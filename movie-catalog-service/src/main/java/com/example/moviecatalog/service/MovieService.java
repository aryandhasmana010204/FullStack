package com.example.moviecatalog.service;

import com.example.moviecatalog.exception.ResourceNotFoundException;
import com.example.moviecatalog.model.Movie;
import com.example.moviecatalog.repository.MovieRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public Page<Movie> getAllMovies(Pageable pageable) {
        return movieRepository.findAll(pageable);
    }

    public Movie getMovieById(String id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie not found with id: " + id));
    }

    public Movie updateMovie(String id, Movie updatedMovie) {
        Movie existingMovie = getMovieById(id);
        existingMovie.setTitle(updatedMovie.getTitle());
        existingMovie.setGenre(updatedMovie.getGenre());
        existingMovie.setRating(updatedMovie.getRating());
        existingMovie.setLanguage(updatedMovie.getLanguage());
        existingMovie.setDuration(updatedMovie.getDuration());
        existingMovie.setReleaseDate(updatedMovie.getReleaseDate());
        existingMovie.setPosterUrl(updatedMovie.getPosterUrl());
        return movieRepository.save(existingMovie);
    }

    public void deleteMovie(String id) {
        Movie existingMovie = getMovieById(id);
        movieRepository.delete(existingMovie);
    }

    public Page<Movie> searchByTitle(String title, Pageable pageable) {
        return movieRepository.findByTitleContainingIgnoreCase(title, pageable);
    }
}
