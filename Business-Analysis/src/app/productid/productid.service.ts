import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ProductidModule } from '../productid/productid/productid.module';

@Injectable({
  providedIn: 'root'
})
export class ProductidService {

  constructor(private http:HttpClient) {}
   
  private userUrl = 'http://localhost:8080/productid';

  public getUsers() {
    return this.http.get<ProductidModule[]>(this.userUrl);
  }
}
