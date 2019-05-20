import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductidService } from './productid.service';
import { ProductidModule } from '../productid/productid/productid.module';

@Component({
  selector: 'app-productid',
  templateUrl: './productid.component.html',
  styleUrls: ['./productid.component.css']
})
export class ProductidComponent implements OnInit {

  products : ProductidModule[];

  constructor(private router: Router, private productService: ProductidService) { }

  ngOnInit() {

    this.productService.getUsers()
    .subscribe( data => {
      this.products = data;
    });
  }

}
