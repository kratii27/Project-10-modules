import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-installment-note',
  templateUrl: './installment-note.component.html'
})
export class InstallmentNoteComponent extends BaseCtl {

   constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
    super(locator.endpoints.INSTALLMENT_NOTE, locator, route);
  }

}
