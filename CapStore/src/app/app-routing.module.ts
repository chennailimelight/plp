import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CapStoreHomepageComponent } from '../app/cap-store-homepage/cap-store-homepage.component'
import { ProductPageComponent } from '../app/product-page/product-page.component'
import { FeedbackComponent } from '../app/feedback/feedback.component'

const routes: Routes = [
  { path: '', redirectTo: '/capstore', pathMatch: 'full' },
  { path: 'capstore', component: CapStoreHomepageComponent  },
  { path: 'product', component: ProductPageComponent  },
  { path: 'feedback', component: FeedbackComponent  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
 