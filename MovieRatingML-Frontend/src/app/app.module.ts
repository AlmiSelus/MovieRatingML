import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';


import { AppComponent }  from './app.component';
import { HeaderModule} from './modules/header/header.module';
import { HomeModule} from './modules/home/home.module';

import { HomeViewComponent } from './views/home/home.view.component';
import { RankingsViewComponent } from './views/rankings/rankings.view.component';


@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    HeaderModule,
    HomeModule
  ],
  declarations: [
    AppComponent,
    HomeViewComponent,
    RankingsViewComponent
  ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
