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
var http_client_service_1 = require('./http.client.service');
var Observable_1 = require('rxjs/Observable');
require('rxjs/add/operator/map');
require('rxjs/add/operator/catch');
require('rxjs/add/operator/do');
var GenresService = (function () {
    function GenresService(_http) {
        this._http = _http;
        this._genresUrl = '/api/genres';
        this._genresUrlMock = '/resources/genres.json';
    }
    GenresService.prototype.getProducts = function () {
        return this._http.get(null, this._genresUrl)
            .map(function (res) { return res.json(); })
            .catch(this.handleError);
    };
    GenresService.prototype.getProductsTMP = function () {
        return this._http.get('http://localhost:3000', this._genresUrlMock)
            .map(function (res) {
            var genres = res.json();
            genres.map(function (genre) { return genre.imageSource = '../../resources/img/genres/' + genre.name.toLowerCase() + '.png'; });
            return genres;
        })
            .catch(this.handleError);
        // this.genres.map((genre:IGenre) => genre.imageSource = '../../resources/img/genres/' + genre.name.toLowerCase() + '.png');
        // console.log(this.genres);
        // return this.genres;
    };
    GenresService.prototype.getImagePath = function (imageName) {
        return '../../resources.img/genres/' + imageName.toLowerCase() + '.png';
    };
    GenresService.prototype.handleError = function (error) {
        console.error(error);
        return Observable_1.Observable.throw(error.json().error || 'Server Error');
    };
    GenresService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [http_client_service_1.HttpClient])
    ], GenresService);
    return GenresService;
}());
exports.GenresService = GenresService;
//# sourceMappingURL=genres.service.js.map