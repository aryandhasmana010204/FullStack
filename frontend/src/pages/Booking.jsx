import React, { useState } from 'react';

function Booking() {
  const [selectedSeat, setSelectedSeat] = useState(null);

  const handleBooking = () => {
    if (selectedSeat) {
      alert(`Successfully booked seat ${selectedSeat}!`);
    } else {
      alert("Please select a seat first.");
    }
  };

  return (
    <div>
      <h1>Book Tickets</h1>
      <p>Select a seat below:</p>
      <div style={{ display: 'flex', gap: '10px', marginBottom: '20px' }}>
        {[1, 2, 3, 4, 5].map(seat => (
          <button 
            key={seat}
            onClick={() => setSelectedSeat(seat)}
            style={{ 
              padding: '10px 20px', 
              background: selectedSeat === seat ? 'green' : '#eee',
              color: selectedSeat === seat ? 'white' : 'black',
              border: '1px solid #ccc',
              cursor: 'pointer'
            }}
          >
            Seat {seat}
          </button>
        ))}
      </div>
      <button onClick={handleBooking} style={{ padding: '10px 20px', fontSize: '16px' }}>
        Confirm Booking
      </button>
    </div>
  );
}

export default Booking;
