import React from 'react';
import { Navigate } from 'react-router-dom';

function ProtectedRoute({ children }) {
  // Concept: If user is not authenticated -> redirect to login
  const isAuthenticated = true; // static for now as per instructions

  return isAuthenticated ? children : <Navigate to="/login" />;
}

export default ProtectedRoute;
