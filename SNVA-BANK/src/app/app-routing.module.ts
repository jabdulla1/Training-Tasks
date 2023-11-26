import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LogInPageComponent } from './loginPage/log-in-page/log-in-page.component';
import { HomePageComponent } from './homePage/home-page/home-page.component';

const routes: Routes = [
  { path: 'login', component: LogInPageComponent },
  { path: 'home', component: HomePageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
