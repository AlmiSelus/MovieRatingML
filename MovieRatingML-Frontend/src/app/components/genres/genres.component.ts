import { Component, OnInit } from '@angular/core';

import { GenresService } from '../../services/genres.service';

import { IGenre } from '../../interfaces/genre.interface';

@Component({
  moduleId: module.id,
  selector: 'genres-component',
  templateUrl: 'genres.component.html',
  styleUrls: ['genres.component.min.css'],
})

export class GenresComponent implements OnInit {
  abstract: any;
  genres: IGenre[];
  listFilter: string;

  constructor(private _genresService: GenresService) {

  }

  ngOnInit(): void {
    this._genresService.getProductsTMP()
    .subscribe(
      products => this.genres = products
    );
  }
}
