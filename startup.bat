:: Start Backend (Spring) Server
set JAVA_HOME=E:\dev\Java\jdk1.8.0_101
set PATH=%PATH%;%JAVA_HOME%\bin
echo %JAVA_HOME%
java -version
start "Movie Rating App Backend" cmd /c "mvn clean install -DskipTests && cd MovieRatingML-Backend && mvn spring-boot:run"

:: Start Frontend (Angular) Server
start "Movie Rating App Frontend" cmd /c "cd MovieRatingML-Frontend && npm start"
