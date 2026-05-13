import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-data',
  templateUrl: './data.component.html'
})
export class DataComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
      super(locator.endpoints.DATA, locator, route);
    }

}
