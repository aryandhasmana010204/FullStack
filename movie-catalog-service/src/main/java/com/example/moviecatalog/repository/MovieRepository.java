package com.example.moviecatalog.repository;

import com.example.moviecatalog.model.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {
    Page<Movie> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}
