"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var movies_service_1 = require('../../services/movies.service');
var MoviesListComponent = (function () {
    function MoviesListComponent(_moviesService) {
        this._moviesService = _moviesService;
    }
    MoviesListComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._moviesService.getMoviesTMP().subscribe(function (movies) { return _this.movies = movies; });
    };
    MoviesListComponent.prototype.genresToString = function (genres) {
        var out = '[ ';
        genres.map(function (genre) { return out += genre.name + ' '; });
        out += ']';
        return out;
    };
    MoviesListComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'movies-list-component',
            templateUrl: 'movies-list.component.html',
            styleUrls: ['movies-list.component.min.css']
        }), 
        __metadata('design:paramtypes', [movies_service_1.MoviesService])
    ], MoviesListComponent);
    return MoviesListComponent;
}());
exports.MoviesListComponent = MoviesListComponent;
//# sourceMappingURL=movies-list.component.js.map