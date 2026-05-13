import { Component } from '@angular/core';
import { BaseListCtl } from '../base-list.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-expense-report-list',
  templateUrl: './expense-report-list.component.html'
})
export class ExpenseReportListComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, route: ActivatedRoute){
    super(locator.endpoints.EXPENSE_REPORT, locator, route);
  }

}
