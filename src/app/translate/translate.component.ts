import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-translate',
  templateUrl: './translate.component.html'
})
export class TranslateComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
      super(locator.endpoints.TRANSLATE, locator, route);
    }

}
