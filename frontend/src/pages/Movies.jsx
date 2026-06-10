import React, { useState, useEffect } from 'react';
import MovieCard from '../components/MovieCard';
// import api from '../services/api'; // Conceptually we'd use this

function Movies() {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    // Conceptually we would do:
    // api.get("/api/movies").then(res => setMovies(res.data));
    
    // Using static data for now
    setMovies([
      { id: 1, title: 'Inception', rating: 8.8 },
      { id: 2, title: 'The Matrix', rating: 8.7 },
      { id: 3, title: 'Interstellar', rating: 8.6 },
    ]);
  }, []);

  return (
    <div>
      <h1>Movie Catalog</h1>
      <div>
        {movies.map((movie) => (
          <MovieCard key={movie.id} title={movie.title} rating={movie.rating} />
        ))}
      </div>
    </div>
  );
}

export default Movies;
