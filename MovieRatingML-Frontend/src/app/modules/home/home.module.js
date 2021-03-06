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
var shared_module_1 = require('../shared/shared.module');
var http_client_service_1 = require('../../services/http.client.service');
var genres_service_1 = require('../../services/genres.service');
var movies_service_1 = require('../../services/movies.service');
var genres_component_1 = require('../../components/genres/genres.component');
var genre_filter_pipe_1 = require('../../filters/genre.filter.pipe');
var movies_list_component_1 = require('../../components/movies-list/movies-list.component');
var HomeModule = (function () {
    function HomeModule() {
    }
    HomeModule = __decorate([
        core_1.NgModule({
            imports: [
                shared_module_1.SharedModule
            ],
            declarations: [
                genres_component_1.GenresComponent,
                genre_filter_pipe_1.GenreFilterPipe,
                movies_list_component_1.MoviesListComponent
            ],
            exports: [
                genres_component_1.GenresComponent,
                movies_list_component_1.MoviesListComponent
            ],
            providers: [
                http_client_service_1.HttpClient,
                genres_service_1.GenresService,
                movies_service_1.MoviesService
            ]
        }), 
        __metadata('design:paramtypes', [])
    ], HomeModule);
    return HomeModule;
}());
exports.HomeModule = HomeModule;
//# sourceMappingURL=home.module.js.map