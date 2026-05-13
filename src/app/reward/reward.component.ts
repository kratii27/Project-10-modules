import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-reward',
  templateUrl: './reward.component.html'
})
export class RewardComponent extends BaseCtl {

   constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
    super(locator.endpoints.REWARD, locator, route);
  }

}
