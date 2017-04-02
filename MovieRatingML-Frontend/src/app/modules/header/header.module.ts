import { NgModule } from '@angular/core';

import { SharedModule} from '../shared/shared.module'


import { NavigationComponent } from '../../components/navigation/navigation.component';
import { BannerComponent } from '../../components/banner/banner.component';

@NgModule({
  imports: [
    SharedModule
  ],
  declarations: [
    NavigationComponent,
    BannerComponent
  ],
  exports: [
    NavigationComponent,
    BannerComponent
  ]
})

export class HeaderModule{

}
