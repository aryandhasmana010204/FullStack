package com.example.moviecatalog.service;

import com.example.moviecatalog.model.Movie;
import com.example.moviecatalog.model.Review;
import com.example.moviecatalog.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieService movieService;

    public ReviewService(ReviewRepository reviewRepository, MovieService movieService) {
        this.reviewRepository = reviewRepository;
        this.movieService = movieService;
    }

    public Review addReview(Review review) {
        Review savedReview = reviewRepository.save(review);
        updateMovieRating(review.getMovieId());
        return savedReview;
    }

    public List<Review> getReviewsByMovieId(String movieId) {
        return reviewRepository.findByMovieId(movieId);
    }

    private void updateMovieRating(String movieId) {
        List<Review> reviews = reviewRepository.findByMovieId(movieId);
        if (reviews.isEmpty()) return;

        double averageRating = reviews.stream()
                .mapToInt(Review::getRating)
                .average()
                .orElse(0.0);

        Movie movie = movieService.getMovieById(movieId);
        movie.setRating(Math.round(averageRating * 10.0) / 10.0);
        movieService.save(movie);
    }
}
