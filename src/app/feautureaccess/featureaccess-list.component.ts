import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-featureaccess-list',
  templateUrl: './featureaccess-list.component.html'
})
export class FeatureaccessListComponent extends BaseListCtl{

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
    super(locator.endpoints.FEATURE, locator, route);
  }

}
