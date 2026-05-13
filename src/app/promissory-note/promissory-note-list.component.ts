import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-promissory-note-list',
  templateUrl: './promissory-note-list.component.html'
})
export class PromissoryNoteListComponent extends BaseListCtl {

  constructor(locator: ServiceLocatorService, route: ActivatedRoute) {
    super(locator.endpoints.PROMISSORY_NOTE, locator, route);
  }

}
