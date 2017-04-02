import { Component } from '@angular/core';

@Component({
  moduleId: module.id,
  templateUrl: 'home.view.component.html'
})

export class HomeViewComponent {
    private pageTitle: string = "MovieRating ML";
    private pageAuthors: string[] = ["Michał Stasiak", "Krzysztof Krawiec"];

}
