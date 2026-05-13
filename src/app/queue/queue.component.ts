import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseCtl } from '../base.component';

@Component({
  selector: 'app-queue',
  templateUrl: './queue.component.html'
})
export class QueueComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute ){
      super(locator.endpoints.QUEUE, locator, route);
    }

}
