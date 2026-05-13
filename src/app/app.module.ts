import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HTTP_INTERCEPTORS, HttpClient, HttpClientModule } from '@angular/common/http';
import { HttpServiceService } from './http-service.service';
import { EndpointServiceService } from './endpoint-service.service';
import { ServiceLocatorService } from './service-locator.service';
import { AuthServiceService } from './auth-service.service';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './login/signup.component';
import { NavbarComponent } from './navbar/navbar.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user/user.component';
import { UserListComponent } from './user/user-list.component';
import { RoleComponent } from './role/role.component';
import { RoleListComponent } from './role/role-list.component';
import { FooterComponent } from './footer/footer.component';
import { MyprofileComponent } from './user/myprofile.component';
import { ChangepasswordComponent } from './user/changepassword.component';
import { ForgotpasswordComponent } from './login/forgotpassword.component';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { RewardComponent } from './reward/reward.component';
import { RewardListComponent } from './reward/reward-list.component';
import { TransportComponent } from './transport/transport.component';
import { TransportListComponent } from './transport/transport-list.component';
import { EmiComponent } from './emi/emi.component';
import { EmiListComponent } from './emi/emi-list.component';
import { PromissoryNoteComponent } from './promissory-note/promissory-note.component';
import { PromissoryNoteListComponent } from './promissory-note/promissory-note-list.component';
import { LockerComponent } from './locker/locker.component';
import { LockerListComponent } from './locker/locker-list.component';
import { ReportComponent } from './report/report.component';
import { ReportListComponent } from './report/report-list.component';
import { InstallmentNoteComponent } from './installment-note/installment-note.component';
import { InstallmentNoteListComponent } from './installment-note/installment-note-list.component';
import { ReturnComponent } from './return/return.component';
import { ReturnListComponent } from './return/return-list.component';
import { ExpenseReportComponent } from './expense-report/expense-report.component';
import { ExpenseReportListComponent } from './expense-report/expense-report-list.component';
import { CurrencyComponent } from './currency/currency.component';
import { CurrencyListComponent } from './currency/currency-list.component';
import { TranslateComponent } from './translate/translate.component';
import { TranslateListComponent } from './translate/translate-list.component';
import { EmailComponent } from './email/email.component';
import { EmailListComponent } from './email/email-list.component';
import { RatingComponent } from './rating/rating.component';
import { RatingListComponent } from './rating/rating-list.component';
import { FilterComponent } from './filter/filter.component';
import { FilterListComponent } from './filter/filter-list.component';
import { FaqComponent } from './faq/faq.component';
import { FaqListComponent } from './faq/faq-list.component';
import { DecryptionComponent } from './decryption/decryption.component';
import { DecryptionListComponent } from './Decryption/decryption-list.component';
import { ThumbnailComponent } from './thumbnail/thumbnail.component';
import { ThumbnailListComponent } from './thumbnail/thumbnail-list.component';
import { RetentionComponent } from './retention/retention.component';
import { RetentionListComponent } from './retention/retention-list.component';
import { ArchivalComponent } from './archival/archival.component';
import { ArchivalListComponent } from './archival/archival-list.component';
import { BlockComponent } from './block/block.component';
import { BlockListComponent } from './block/block-list.component';
import { FeautureaccessComponent } from './feautureaccess/feautureaccess.component';
import { FeatureaccessListComponent } from './feautureaccess/featureaccess-list.component';
import { DataComponent } from './data/data.component';
import { DataListComponent } from './data/data-list.component';
import { QueueComponent } from './queue/queue.component';
import { QueueListComponent } from './queue/queue-list.component';





export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    NavbarComponent,
    DashboardComponent,
    UserComponent,
    UserListComponent,
    RoleComponent,
    RoleListComponent,
    FooterComponent,
    MyprofileComponent,
    ChangepasswordComponent,
    ForgotpasswordComponent,
    RewardComponent,
    RewardListComponent,
    TransportComponent,
    TransportListComponent,
    EmiComponent,
    EmiListComponent,
    PromissoryNoteComponent,
    PromissoryNoteListComponent,
    LockerComponent,
    LockerListComponent,
    ReportComponent,
    ReportListComponent,
    InstallmentNoteComponent,
    InstallmentNoteListComponent,
    ReturnComponent,
    ReturnListComponent,
    ExpenseReportComponent,
    ExpenseReportListComponent,
    CurrencyComponent,
    CurrencyListComponent,
    TranslateComponent,
    TranslateListComponent,
    EmailComponent,
    EmailListComponent,
    RatingComponent,
    RatingListComponent,
    FilterComponent,
    FilterListComponent,
    FaqComponent,
    FaqListComponent,
    DecryptionComponent,
    DecryptionListComponent,
    ThumbnailComponent,
    ThumbnailListComponent,
    RetentionComponent,
    RetentionListComponent,
    ArchivalComponent,
    ArchivalListComponent,
    BlockComponent,
    BlockListComponent,
    FeautureaccessComponent,
    FeatureaccessListComponent,
    DataComponent,
    DataListComponent,
    QueueComponent,
    QueueListComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
    FormsModule
  ],
  providers: [
    HttpServiceService,
    EndpointServiceService,
    ServiceLocatorService,
    {
      provide: HTTP_INTERCEPTORS, useClass: AuthServiceService, multi: true
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }