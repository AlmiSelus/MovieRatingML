import { Injectable } from '@angular/core';
import { Response } from '@angular/http';
import { HttpClient } from './http.client.service';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/do';

import { IGenre } from '../interfaces/genre.interface';

@Injectable()
export class GenresService {
  private _genresUrl = '/api/genres';
  private _genresUrlMock = '/resources/genres.json';


  constructor( private _http: HttpClient ) {

  }

  getProducts(): Observable<IGenre[]> {
    return this._http.get( null, this._genresUrl )
      .map((res:Response) => <IGenre[]> res.json())
      .catch(this.handleError);
  }

  getProductsTMP():Observable<IGenre[]> {
    return this._http.get('http://localhost:3000',this._genresUrlMock)
      .map(function(res:Response) {
        let genres: IGenre[] = res.json();
        genres.map((genre: IGenre) => genre.imageSource = '../../resources/img/genres/' + genre.name.toLowerCase() + '.png');
        return genres;
      })
      .catch(this.handleError);
    // this.genres.map((genre:IGenre) => genre.imageSource = '../../resources/img/genres/' + genre.name.toLowerCase() + '.png');
    // console.log(this.genres);
    // return this.genres;
  }

  getImagePath(imageName: string) {
    return '../../resources.img/genres/' + imageName.toLowerCase() + '.png';
  }

  private handleError(error:Response) {
    console.error(error);
    return Observable.throw(error.json().error || 'Server Error');
  }
}
