import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-email-list',
  templateUrl: './email-list.component.html'
})
export class EmailListComponent extends BaseListCtl {

    constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
        super(locator.endpoints.EMAIL, locator, route);
      }

}
