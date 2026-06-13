package com.example.moviecatalog.controller;

import com.example.moviecatalog.dto.ApiResponse;
import com.example.moviecatalog.model.Review;
import com.example.moviecatalog.service.ReviewService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<Review>> addReview(@RequestBody Review review) {
        Review savedReview = reviewService.addReview(review);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success("Review added successfully", savedReview));
    }

    @GetMapping("/{movieId}")
    public ResponseEntity<ApiResponse<List<Review>>> getReviewsByMovieId(@PathVariable String movieId) {
        List<Review> reviews = reviewService.getReviewsByMovieId(movieId);
        return ResponseEntity.ok(ApiResponse.success("Reviews fetched successfully", reviews));
    }
}
