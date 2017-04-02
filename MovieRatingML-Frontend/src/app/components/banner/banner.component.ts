import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs/Rx';

import { IBannerImage } from './banner_image.interface';

@Component({
  moduleId: module.id,
  selector: 'banner-component',
  templateUrl: 'banner.component.html',
  styleUrls: ['banner.component.min.css']
})
export class BannerComponent implements OnInit{
  abstract: any;
  private bannerImages: IBannerImage[] = [
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

  ngOnInit(){
    let index: number = 0;
    let prevIndex: number = 0;
    let timer = Observable.timer(500,5000);
    timer.subscribe(t=>{
      if(index >= this.bannerImages.length){
        index = 0;
      }
      this.bannerImages[prevIndex].visible = false;
      this.bannerImages[index].visible = true;
      prevIndex = index;
      index ++;

    });
    console.log("@BannerComponent - Init")
  }

}
