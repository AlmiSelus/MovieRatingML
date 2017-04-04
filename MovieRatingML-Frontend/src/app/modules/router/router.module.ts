import { NgModule } from '@angular/core';

import { RouterModule, Routes } from '@angular/router';

import { HomeViewComponent } from '../../views/home/home.view.component';
import { RankingsViewComponent } from '../../views/rankings/rankings.view.component';

const appRoutes: Routes = [
  { path: 'home', component: HomeViewComponent },
  { path: 'rankings', component: RankingsViewComponent },
  { path: '',   redirectTo: '/home', pathMatch: 'full' },
  { path: '**', redirectTo: 'welcome', pathMatch: 'full'}
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes),
  ],
  declarations: [

  ],
  exports: [
    RouterModule
  ]
})

export class AppRouterModule {

}
