import { Component } from '@angular/core';

@Component({
  moduleId: module.id,
  templateUrl: 'welcome.component.html'
})

export class WelcomeComponent {
    private pageTitle: string = "MovieRating ML";
    private pageAuthors: string[] = ["Michał Stasiak", "Krzysztof Krawiec"];

}
