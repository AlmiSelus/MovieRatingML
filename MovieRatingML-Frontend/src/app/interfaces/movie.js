"use strict";
var Movie = (function () {
    function Movie() {
    }
    Movie.prototype.genresToString = function (genres) {
        var output = "[";
        this.genres.map(function (genre) { return output += genre.name + " "; });
        output += "]";
        return output;
    };
    return Movie;
}());
exports.Movie = Movie;
//# sourceMappingURL=movie.js.map