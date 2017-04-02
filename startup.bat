:: Start Backend (Spring) Server
cd MovieRatingML-Backend
start "Movie Rating App Backend" mvn clean spring-boot:run
cd ..

:: Start Frontend (Angular) Server
cd MovieRatingML-Frontend
start "Movie Rating App Frontend" npm start
cd ..
