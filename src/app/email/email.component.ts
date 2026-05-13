import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-email',
  templateUrl: './email.component.html'
})
export class EmailComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
      super(locator.endpoints.EMAIL, locator, route);
    }

}
