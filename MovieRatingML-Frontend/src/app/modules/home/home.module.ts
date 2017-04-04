import { NgModule } from '@angular/core';

import { SharedModule} from '../shared/shared.module';

import { HttpClient } from '../../services/http.client.service';
import { GenresService } from '../../services/genres.service';

import { GenresComponent } from '../../components/genres/genres.component';

@NgModule({
  imports: [
    SharedModule
  ],
  declarations: [
    GenresComponent
  ],
  exports: [
    GenresComponent
  ],
  providers: [
    HttpClient,
    GenresService
  ]
})

export class HomeModule {

}
