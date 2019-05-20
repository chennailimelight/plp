import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

@NgModule({
  declarations: [],
  imports: [
    CommonModule
  ]
})
export class ProductidModule {
    id: number;
      name: String;
        brand: String
        category: String;
        merchantid: String;
        price: number;
        stock: number;
        sold: number;
        rating: number;
 }
