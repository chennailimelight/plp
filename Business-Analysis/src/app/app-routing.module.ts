import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ProductidComponent} from './productid/productid.component';
import {CategoryComponent } from './category/category.component';
import { MerchantidComponent } from './merchantid/merchantid.component';

const routes: Routes = [
  { path: 'productid', component: ProductidComponent },
  { path: 'category', component: CategoryComponent},
  { path: 'merchantid', component: MerchantidComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
