import { NgModule } from '@angular/core';

import { HeaderComponent } from '../../components/header/header.component'
import { NavigationComponent } from '../../components/navigation/navigation.component';

@NgModule({
  imports: [
  ],
  declarations: [
    HeaderComponent,
    NavigationComponent
  ],
  exports: [
    HeaderComponent
  ]
})

export class HeaderModule{

}
