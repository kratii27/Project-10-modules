import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-decryption-list',
  templateUrl: './decryption-list.component.html'
})
export class DecryptionListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
      super(locator.endpoints.DECRYPTION, locator, route);
    }

}
