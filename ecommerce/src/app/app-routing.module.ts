import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {SignupComponent} from './signup/signup.component';
import {AppComponent} from './app.component'
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {ForgotPasswordComponent} from './forgot-password/forgot-password.component';
import {ChatComponent} from './chat/chat.component';
import {ChangePasswordComponent} from './change-password/change-password.component';
import { from } from 'rxjs';
import {ProductPageComponent } from './product-page/product-page.component';
import {FeedbackComponent} from './feedback/feedback.component';
const routes: Routes = [
  {path:'chat', component:ChatComponent},
  {path:'changepassword', component:ChangePasswordComponent},
  {path:'logout', component:ForgotPasswordComponent},
  {path:'signup', component:SignupComponent},
  {path:'', component:HomeComponent},
  {path:'login', component:LoginComponent},
  {path:'forgotpassword', component:ForgotPasswordComponent},
  {path:'product', component:ProductPageComponent},
  {path:'feedback', component:FeedbackComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
