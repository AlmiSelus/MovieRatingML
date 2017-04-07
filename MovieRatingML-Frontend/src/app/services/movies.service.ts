import { Injectable } from '@angular/core';
import { Response } from '@angular/http';
import { HttpClient } from './http.client.service';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';

import { IMovie } from '../interfaces/movie.interface';

@Injectable()
export class MoviesService {
  private _moviesUrl = '/api/movies';
  private _moviesUrlMock = '/resources/movies.json';


  constructor( private _http: HttpClient ) {

  }

  getMovies(): Observable<IMovie[]> {
    return this._http.get( null, this._moviesUrl )
      .map((res:Response) => <IMovie[]> res.json())
      .catch(this.handleError);
  }

  getMoviesTMP():Observable<IMovie[]> {
    return this._http.get( null, this._moviesUrlMock )
      .map((res:Response) => <IMovie[]> res.json())
      .catch(this.handleError);
  }

  private handleError(error:Response) {
    console.error(error);
    return Observable.throw(error.json().error || 'Server Error');
  }
}
