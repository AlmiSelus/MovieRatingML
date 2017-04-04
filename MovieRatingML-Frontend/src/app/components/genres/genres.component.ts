import { Component, OnInit } from '@angular/core';

import { GenresService } from '../../services/genres.service';

import { IGenre } from '../../interfaces/genre.interface';

@Component({
  moduleId: module.id,
  selector: 'genres-component',
  templateUrl: 'genres.component.html'
})

export class GenresComponent implements OnInit{
  abstract: any;
  genres: IGenre[];

  constructor(private _genresService: GenresService){

  }

  ngOnInit(): void {
    this._genresService.getProducts()
    .subscribe(
      products => this.genres = products
    );
  }
}
