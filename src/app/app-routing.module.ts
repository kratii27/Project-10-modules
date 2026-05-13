import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './login/signup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user/user.component';
import { UserListComponent } from './user/user-list.component';
import { RoleComponent } from './role/role.component';
import { RoleListComponent } from './role/role-list.component';
import { ForgotpasswordComponent } from './login/forgotpassword.component';
import { MyprofileComponent } from './user/myprofile.component';
import { ChangepasswordComponent } from './user/changepassword.component';
import { RewardComponent } from './reward/reward.component';
import { RewardListComponent } from './reward/reward-list.component';
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
import { QueueComponent } from './queue/queue.component';
import { QueueListComponent } from './queue/queue-list.component';

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'dashboard'
  },
  {
    path: 'dashboard',
    component: DashboardComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'signup',
    component: SignupComponent
  },
  {
    path: 'user',
    component: UserComponent
  },
  {
    path: 'user/:id',
    component: UserComponent
  },
  {
    path: 'userlist',
    component: UserListComponent
  },
  {
    path: 'role',
    component: RoleComponent
  },
  {
    path: 'role/:id',
    component: RoleComponent
  },
  {
    path: 'rolelist',
    component: RoleListComponent
  },
  {
    path: 'forgotpassword',
    component: ForgotpasswordComponent
  },
  {
    path: 'myprofile',
    component: MyprofileComponent
  },
  {
    path: 'myprofile/:id',
    component: MyprofileComponent
  },
  {
    path: 'changepassword',
    component: ChangepasswordComponent
  },
  {
    path: 'signup',
    component: SignupComponent
  },
  {
    path: 'reward',
    component: RewardComponent
  },
  {
    path: 'reward/:id',
    component: RewardComponent
  },
  {
    path: 'rewardlist',
    component: RewardListComponent
  },
  {
    path: 'emi',
    component: EmiComponent
  },
  {
    path: 'emi/:id',
    component: EmiComponent
  },
  {
    path: 'emilist',
    component: EmiListComponent
  },
  {
    path: 'promissory',
    component: PromissoryNoteComponent
  },
  {
    path: 'promissory/:id',
    component: PromissoryNoteComponent
  },
  {
    path: 'promissorylist',
    component: PromissoryNoteListComponent
  },
  {
    path: 'locker',
    component: LockerComponent
  },
  {
    path: 'locker/:id',
    component: LockerComponent
  },
  {
    path: 'lockerlist',
    component: LockerListComponent
  },
  {
    path: 'report',
    component: ReportComponent
  },
  {
    path: 'report/:id',
    component: ReportComponent
  },
  {
    path: 'reportlist',
    component: ReportListComponent
  },
  {
    path: 'installmentnote',
    component: InstallmentNoteComponent
  },
  {
    path: 'installmentnote/:id',
    component: InstallmentNoteComponent
  },
  {
    path: 'installmentnotelist',
    component: InstallmentNoteListComponent
  },
  {
    path: 'return',
    component: ReturnComponent
  },
  {
    path: 'return/:id',
    component: ReturnComponent
  },
  {
    path: 'returnlist',
    component: ReturnListComponent
  },
  {
    path: 'expensereport',
    component: ExpenseReportComponent
  },
  {
    path: 'expensereport/:id',
    component: ExpenseReportComponent
  },
  {
    path: 'expensereportlist',
    component: ExpenseReportListComponent
  },
  {
    path: 'currency',
    component: CurrencyComponent
  },
  {
    path: 'currency/:id',
    component: CurrencyComponent
  },
  {
    path: 'currencylist',
    component: CurrencyListComponent
  },
  {
    path: 'translate',
    component: TranslateComponent
  },
  {
    path: 'translate/:id',
    component: TranslateComponent
  },
  {
    path: 'translatelist',
    component: TranslateListComponent
  },
  {
    path: 'email',
    component: EmailComponent
  },
  {
    path: 'email/:id',
    component: EmailComponent
  },
  {
    path: 'emaillist',
    component: EmailListComponent
  },
  {
    path: 'rating',
    component: RatingComponent
  },
  {
    path: 'rating/:id',
    component: RatingComponent
  },
  {
    path: 'ratinglist',
    component: RatingListComponent
  },
    {
    path: 'filter',
    component: FilterComponent
  },
  {
    path: 'filter/:id',
    component: FilterComponent
  },
  {
    path: 'filterlist',
    component: FilterListComponent
  },
    {
    path: 'faq',
    component: FaqComponent
  },
  {
    path: 'faq/:id',
    component: FaqComponent
  },
  {
    path: 'faqlist',
    component: FaqListComponent
  },
      {
    path: 'decryption',
    component: DecryptionComponent
  },
  {
    path: 'decryption/:id',
    component: DecryptionComponent
  },
  {
    path: 'decryptionlist',
    component: DecryptionListComponent
  },
  {
    path: 'thumbnail',
    component: ThumbnailComponent
  },
  {
    path: 'thumbnail/:id',
    component: ThumbnailComponent
  },
  {
    path: 'thumbnaillist',
    component: ThumbnailListComponent
  },
  {
    path: 'retention',
    component: RetentionComponent
  },
  {
    path: 'retention/:id',
    component: RetentionComponent
  },
  {
    path: 'retentionlist',
    component: RetentionListComponent
  },
   {
    path: 'archival',
    component: ArchivalComponent
  },
  {
    path: 'archival/:id',
    component: ArchivalComponent
  },
  {
    path: 'archivallist',
    component: ArchivalListComponent
  },
  {
    path: 'block',
    component: BlockComponent
  },
  {
    path: 'block/:id',
    component: BlockComponent
  },
  {
    path: 'blocklist',
    component: BlockListComponent
  },
  {
    path: 'feature',
    component: FeautureaccessComponent
  },
  {
    path: 'feature/:id',
    component: FeautureaccessComponent
  },
  {
    path: 'featurelist',
    component: FeatureaccessListComponent
  },
  {
    path: 'queue',
    component: QueueComponent
  },
  {
    path: 'queue/:id',
    component: QueueComponent
  },
  {
    path: 'queuelist',
    component: QueueListComponent
  },
  
  
   


];

@NgModule({
  imports: [RouterModule.forRoot(routes, { useHash: true })],
  exports: [RouterModule]
})
export class AppRoutingModule { }