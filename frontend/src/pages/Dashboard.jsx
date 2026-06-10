import React from 'react';

function Dashboard() {
  const role = "admin"; // Static RBAC concept

  return (
    <div>
      <h1>Dashboard</h1>
      <p>Welcome to the Movie Booking Dashboard!</p>
      
      {role === "admin" && (
        <div style={{ padding: '10px', border: '1px solid red', marginTop: '10px' }}>
          <h3>Admin Panel</h3>
          <p>Here you can manage movies, users, and shows.</p>
        </div>
      )}

      {role === "theatre_owner" && (
        <div style={{ padding: '10px', border: '1px solid blue', marginTop: '10px' }}>
          <h3>Theatre Owner Panel</h3>
          <p>Here you can manage your shows and view reports.</p>
        </div>
      )}
    </div>
  );
}

export default Dashboard;
