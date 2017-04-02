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
var Rx_1 = require('rxjs/Rx');
var BannerComponent = (function () {
    function BannerComponent() {
        this.bannerImages = [
            {
                path: '../../../resources/img/banner/banner_0.png',
                alt: 'Deadpool Banner',
                visible: false
            },
            {
                path: '../../../resources/img/banner/banner_1.png',
                alt: 'Batman Banner',
                visible: false
            },
            {
                path: '../../../resources/img/banner/banner_2.png',
                alt: 'Spiderman Banner',
                visible: false
            },
        ];
    }
    BannerComponent.prototype.ngOnInit = function () {
        var _this = this;
        var index = 0;
        var prevIndex = 0;
        var timer = Rx_1.Observable.timer(500, 5000);
        timer.subscribe(function (t) {
            if (index >= _this.bannerImages.length) {
                index = 0;
            }
            _this.bannerImages[prevIndex].visible = false;
            _this.bannerImages[index].visible = true;
            prevIndex = index;
            index++;
        });
        console.log("@BannerComponent - Init");
    };
    BannerComponent = __decorate([
        core_1.Component({
            moduleId: module.id,
            selector: 'banner-component',
            templateUrl: 'banner.component.html',
            styleUrls: ['banner.component.min.css']
        }), 
        __metadata('design:paramtypes', [])
    ], BannerComponent);
    return BannerComponent;
}());
exports.BannerComponent = BannerComponent;
//# sourceMappingURL=banner.component.js.map