:: Start Backend (Spring) Server
cd MovieRatingML-Backend
start "Movie Rating App Backend" mvn clean spring-boot:run
cd ..

:: Start Frontend (Angular) Server
cd MovieRatingML-Frontend
start "Movie Rating App Frontend" #CMD# :: replace #CMD# with proper frontend startup cmd (like npm start or something)
cd ..