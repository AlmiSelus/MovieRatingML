# MovieRatingML
Movies Rating with Machine Learning Project. Training project to polish some skills and learn new ones (Machine Learning with DeepLearning4j and Angular 2)


## Stack:
- Java 8
- Maven
- Spring
- DeepLearning4j
- Angular


## Startup:
To start both front-end and back-end servers please run startup.bat script. Each of front-end/back-end servers will then start in separate cmd window.

## Current request possibilities
### GET
- /api/movies
Returns list of all movies in the database

- /api/genre/{genre}
Returns all movies for specified {genre}. Example: /api/genre/Sci-Fi will return all Sci-Fi movies.

### POST
None (for the time being)

## Current Genres
- Sci-Fi
- Action

(Though, both return the same movies)