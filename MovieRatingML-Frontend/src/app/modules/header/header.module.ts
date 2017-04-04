import { NgModule } from '@angular/core';

import { AppRouterModule } from '../../modules/router/router.module';
import { SharedModule} from '../shared/shared.module';


import { NavigationComponent } from '../../components/navigation/navigation.component';
import { BannerComponent } from '../../components/banner/banner.component';

@NgModule({
  imports: [
    SharedModule,
    AppRouterModule
  ],
  declarations: [
    NavigationComponent,
    BannerComponent
  ],
  exports: [
    AppRouterModule,
    NavigationComponent,
    BannerComponent
  ]
})

export class HeaderModule {

}
