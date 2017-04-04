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
var genres_service_1 = require('../../services/genres.service');
var GenresComponent = (function () {
    function GenresComponent(_genresService) {
        this._genresService = _genresService;
    }
    GenresComponent.prototype.ngOnInit = function () {
        var _this = this;
        this._genresService.getProducts()
            .subscribe(function (products) { return _this.genres = products; });
    };
    GenresComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'genres-component',
            templateUrl: 'genres.component.html'
        }), 
        __metadata('design:paramtypes', [genres_service_1.GenresService])
    ], GenresComponent);
    return GenresComponent;
}());
exports.GenresComponent = GenresComponent;
//# sourceMappingURL=genres.component.js.map