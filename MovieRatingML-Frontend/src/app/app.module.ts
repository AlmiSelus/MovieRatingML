import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';


import { AppComponent }  from './app.component';
import { HeaderModule} from './modules/header/header.module';
import { HomeViewComponent } from './views/home/home.view.component';

@NgModule({
  imports: [
    BrowserModule,
    HttpModule,
    RouterModule.forRoot([
      { path: '', component: HomeViewComponent },
      { path: '**', redirectTo: 'welcome', pathMatch: 'full'}
    ]),
    HeaderModule
  ],
  declarations: [
    AppComponent,
    HomeViewComponent
  ],
  bootstrap:    [ AppComponent ]
})
export class AppModule { }
