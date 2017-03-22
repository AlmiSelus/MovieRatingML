import { Component } from '@angular/core';

@Component({
    templateUrl: 'app/welcome/welcome.component.html'
})

export class WelcomeComponent {
    private pageTitle: string = "MovieRating ML";
    private pageAuthors: string[] = ["Michał Stasiak", "Krzysztof Krawiec"];

}