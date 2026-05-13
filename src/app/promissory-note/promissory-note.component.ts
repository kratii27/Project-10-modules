import { Component } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-promissory-note',
  templateUrl: './promissory-note.component.html'
})
export class PromissoryNoteComponent extends BaseCtl{

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
    super(locator.endpoints.PROMISSORY_NOTE, locator, route);
  }

}
