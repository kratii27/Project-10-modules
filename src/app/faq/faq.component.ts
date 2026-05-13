import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-faq',
  templateUrl: './faq.component.html'
})
export class FaqComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
      super(locator.endpoints.FAQ, locator, route);
    }

}
