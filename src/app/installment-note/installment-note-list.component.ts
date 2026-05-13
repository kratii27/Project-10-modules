import { Component } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-installment-note-list',
  templateUrl: './installment-note-list.component.html'
})
export class InstallmentNoteListComponent extends BaseListCtl {

   constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
    super(locator.endpoints.INSTALLMENT_NOTE, locator, route);
  }

}
