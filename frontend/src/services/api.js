import axios from 'axios';

// Conceptually this abstracts API calls and prepares for backend integration
const api = axios.create({
  baseURL: '/api'
});

export default api;
