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

  constructor(private _http:HttpClient) {

  }

  getProducts():Observable<IGenre[]> {
    return this._http.get(this._genresUrl)
      .map((res:Response) => <IGenre[]> res.json())
      .do(data => console.log("All: " + JSON.stringify(data)))
      .catch(this.handleError);
  }

  private handleError(error: Response) {
    console.error(error);
    return Observable.throw(error.json().error || 'Server Error');
  }
}
