import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';

@Component({
  selector: 'app-rating',
  templateUrl: './rating.component.html'
})
export class RatingComponent extends BaseCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
      super(locator.endpoints.RATING, locator, route);
    }

}
