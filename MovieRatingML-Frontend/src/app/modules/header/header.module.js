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
var router_module_1 = require('../../modules/router/router.module');
var shared_module_1 = require('../shared/shared.module');
var navigation_component_1 = require('../../components/navigation/navigation.component');
var banner_component_1 = require('../../components/banner/banner.component');
var HeaderModule = (function () {
    function HeaderModule() {
    }
    HeaderModule = __decorate([
        core_1.NgModule({
            imports: [
                shared_module_1.SharedModule,
                router_module_1.AppRouterModule
            ],
            declarations: [
                navigation_component_1.NavigationComponent,
                banner_component_1.BannerComponent
            ],
            exports: [
                router_module_1.AppRouterModule,
                navigation_component_1.NavigationComponent,
                banner_component_1.BannerComponent
            ]
        }), 
        __metadata('design:paramtypes', [])
    ], HeaderModule);
    return HeaderModule;
}());
exports.HeaderModule = HeaderModule;
//# sourceMappingURL=header.module.js.map