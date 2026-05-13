import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-thumbnail-list',
  templateUrl: './thumbnail-list.component.html'
})
export class ThumbnailListComponent extends BaseListCtl{

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
      super(locator.endpoints.THUMBNAIL, locator, route)
    }

}
