import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import { User } from 'src/models/users.model';
import { UserService } from 'src/app/user.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [UserService]
})

export class LoginComponent implements OnInit {
  user : User={
    email:"",
    password:"",
    uname:"",
    token:""
  }
  ngOnInit() {

}
constructor(private router:Router, private userservice: UserService ){}

  private userUrl = 'http://localhost:8080/';
  //private userUrl = '/api';

  public loginUser(user: User): void{
   this.userservice.loginUser(user);
  }
}