import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductidService } from './productid/productid.service';
import {HttpClientModule} from "@angular/common/http";
import { ProductidComponent } from './productid/productid.component';
import { CategoryComponent } from './category/category.component';
import { MerchantidComponent } from './merchantid/merchantid.component';


@NgModule({
  declarations: [
    AppComponent,
    CategoryComponent,
    ProductidComponent,
    MerchantidComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ProductidService],
  bootstrap: [AppComponent]
})
export class AppModule { }
