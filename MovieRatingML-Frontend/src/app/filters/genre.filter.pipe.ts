import { PipeTransform, Pipe } from '@angular/core';

import { IGenre } from '../interfaces/genre.interface';


@Pipe({
  name: 'genreFilter'
})
export class GenreFilterPipe implements PipeTransform {

  transform(value: IGenre[], filterBy: string): IGenre[] {
    console.log(filterBy);
    filterBy = filterBy ? filterBy.toLocaleLowerCase() : null;
    return filterBy ? value.filter((genre: IGenre) =>
    genre.name.toLocaleLowerCase().indexOf(filterBy) !== -1) : value;
  }
}
