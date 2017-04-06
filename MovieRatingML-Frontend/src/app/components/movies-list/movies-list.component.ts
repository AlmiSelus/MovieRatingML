import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../../services/movies.service';
import { IMovie } from '../../interfaces/movie.interface';
import { IGenre } from '../../interfaces/genre.interface';

@Component({
  moduleId: module.id,
  selector: 'movies-list-component',
  templateUrl: 'movies-list.component.html',
  styleUrls: ['movies-list.component.min.css']
})

export class MoviesListComponent implements OnInit {
  abstract: any;
  private movies: IMovie[];

  constructor(private _moviesService: MoviesService) {

  }

  ngOnInit(): void {
    this._moviesService.getMoviesTMP().subscribe(
        movies => this.movies = movies
    );
  }

  genresToString(genres: IGenre[] ):string{
    let out: string = '[ ';
    genres.map((genre: IGenre) => out += genre.name + ' ');
    out += ']';
    return out;
  }
}

