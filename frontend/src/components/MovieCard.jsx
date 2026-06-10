import React from 'react';

function MovieCard({ title, rating }) {
  return (
    <div style={{ border: '1px solid #ccc', padding: '10px', margin: '10px 0', borderRadius: '5px' }}>
      <h3>{title}</h3>
      <p>Rating: {rating} / 10</p>
    </div>
  );
}

export default MovieCard;
