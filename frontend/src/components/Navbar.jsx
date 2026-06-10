import React from 'react';
import { Link } from 'react-router-dom';

function Navbar() {
  return (
    <nav style={{ padding: '10px', background: '#333', color: '#fff' }}>
      <h2>Movie Booking System</h2>
      <ul style={{ display: 'flex', listStyle: 'none', gap: '15px' }}>
        <li><Link to="/dashboard" style={{ color: '#fff', textDecoration: 'none' }}>Dashboard</Link></li>
        <li><Link to="/movies" style={{ color: '#fff', textDecoration: 'none' }}>Movie Catalog</Link></li>
        <li><Link to="/book" style={{ color: '#fff', textDecoration: 'none' }}>Book Tickets</Link></li>
        <li><Link to="/login" style={{ color: '#fff', textDecoration: 'none' }}>Logout</Link></li>
      </ul>
    </nav>
  );
}

export default Navbar;
