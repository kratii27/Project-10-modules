import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EndpointServiceService {

  constructor() { }

  public SERVER_URL = "http://localhost:8080";
  public USER = this.SERVER_URL + "/User";
  public ROLE = this.SERVER_URL + "/Role";
  public REWARD = this.SERVER_URL + "/Reward";
  public TRANSPORT = this.SERVER_URL + "/Transport";
  public EMI = this.SERVER_URL + "/Emi";
  public PROMISSORY_NOTE = this.SERVER_URL + "/PromissoryNote";
  public LOCKER = this.SERVER_URL + "/Locker";
  public REPORT = this.SERVER_URL + "/Report";
  public INSTALLMENT_NOTE = this.SERVER_URL + "/InstallmentNote";
  public RETURN = this.SERVER_URL + "/Return";
  public EXPENSE_REPORT = this.SERVER_URL + "/ExpenseReport";
  public CURRENCY = this.SERVER_URL + "/Currency";
  public TRANSLATE = this.SERVER_URL + "/Translate";
  public EMAIL = this.SERVER_URL + "/Email";
  public RATING = this.SERVER_URL + "/Rating";
  public FILTER = this.SERVER_URL + "/Filter";
  public FAQ = this.SERVER_URL + "/Faq";
  public DECRYPTION = this.SERVER_URL + "/Decryption";
  public THUMBNAIL = this.SERVER_URL + "/Thumbnail";
  public RETENTION = this.SERVER_URL + "/Retention";
  public ARCHIVAL = this.SERVER_URL + "/Archival";
  public BLOCK = this.SERVER_URL + "/BlockList";
  public FEATURE = this.SERVER_URL + "/FeatureAccess";
  public DATA = this.SERVER_URL + "/DataSource";
  public QUEUE = this.SERVER_URL + "/QueueListener";
}
