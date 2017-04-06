import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';

@Injectable()
export class HttpClient {
  http: Http;
  urlPrefix: string;

  constructor(http: Http) {
    this.http = http;
    this.urlPrefix = 'http://localhost:8080';
  }

  createAuthorizationHeader(headers: Headers) {
    headers.append('Authorization', 'Basic ' +
      btoa('user:password'));
    headers.append('Content-Type', 'text/plain');
  }

  get(host: any, url: any) {
    let headers = new Headers();
    this.urlPrefix = host || this.urlPrefix;
    this.createAuthorizationHeader(headers);
    return this.http.get(this.urlPrefix + url,{
      headers: headers
    });
  }

  post(url: any, data: any) {
    let headers = new Headers();
    this.createAuthorizationHeader(headers);
    return this.http.post(this.urlPrefix + url, data, {
      headers: headers
    });
  }
}
