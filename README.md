# FullStack Microservices Project (CineVerse)

A full-stack microservices application built with React, Spring Boot, and Spring Cloud Gateway. The project is developed day-by-day, progressively adding features and architectural components.

## Project Structure
- **`frontend/`**: React application built with Vite
- **`backend/`** (`auth`): Spring Boot Authentication Service
- **`api-gateway/`**: Spring Cloud Gateway for routing and centralized JWT validation

---

## Day-by-Day Progress

### Day 1: Project Initialization
- Initialized the root Git repository and base project structure.

### Day 2: Frontend Setup
- Set up a React frontend application using Vite.
- Implemented core UI components (`Navbar`, `MovieCard`) and Pages (`Dashboard`, `Login`, `Movies`, `Booking`, `Register`).
- Added React Router for navigation, basic CSS styling, and Axios API service setup.

### Day 3: Backend Authentication Service
- Created the Spring Boot `auth` service (backend).
- Configured PostgreSQL database connection and Spring Data JPA.
- Implemented user registration, login endpoints, and custom exception handling.
- Added Spring Security and a JWT-based authentication filter.
- Updated frontend to connect to the backend login/register APIs.

### Day 4: API Gateway and Centralized Security
- Created a Spring Cloud `api-gateway` project.
- Configured routing rules to forward traffic seamlessly to the `auth` backend (e.g., `/auth/**`).
- Implemented a `GlobalFilter` for centralized JWT validation at the gateway level.
- Secured backend services by ensuring only requests with valid JWTs in the Authorization header are forwarded.
