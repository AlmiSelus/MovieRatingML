import { NgModule } from '@angular/core';

import { SharedModule} from '../shared/shared.module';

import { HttpClient } from '../../services/http.client.service';
import { GenresService } from '../../services/genres.service';
import { MoviesService } from '../../services/movies.service';

import { GenresComponent } from '../../components/genres/genres.component';
import { GenreFilterPipe } from '../../filters/genre.filter.pipe';
import { MoviesListComponent } from '../../components/movies-list/movies-list.component'

@NgModule({
  imports: [
    SharedModule
  ],
  declarations: [
    GenresComponent,
    GenreFilterPipe,
    MoviesListComponent
  ],
  exports: [
    GenresComponent,
    MoviesListComponent
  ],
  providers: [
    HttpClient,
    GenresService,
    MoviesService
  ]
})

export class HomeModule {

}
