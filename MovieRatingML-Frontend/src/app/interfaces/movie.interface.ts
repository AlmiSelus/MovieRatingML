import { IGenre } from './genre.interface';

export interface IMovie{
  name: string;
  duration: number;
  imdbScore: number;
  genres: IGenre[];
}
