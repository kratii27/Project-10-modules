import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-translate-list',
  templateUrl: './translate-list.component.html'
})
export class TranslateListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
        super(locator.endpoints.TRANSLATE, locator, route);
  }

}
