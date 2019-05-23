import { Component, OnInit } from '@angular/core';
import { Product } from '../product';
import { PRODUCTS } from '../mock-products';

@Component({
  selector: 'app-product-page',
  templateUrl: './product-page.component.html',
  styleUrls: ['./product-page.component.css']
})
export class ProductPageComponent implements OnInit {

  products = PRODUCTS;

  selectedProduct: Product;
  onSelect(product: Product): void {
    this.selectedProduct = product;
  }
  Sort(product:Product):void{
  }

  product: Product =
  {
    id: 1,
    name: "Mens Cap",
    category: "Cap",
    price: 2000,
    discount: 20,
    description: "Some text about the product. Super slim and comfy",
    image: "../../assets/images/menscap.jpg",
  };
  constructor() { }

  ngOnInit() {
  }

}
