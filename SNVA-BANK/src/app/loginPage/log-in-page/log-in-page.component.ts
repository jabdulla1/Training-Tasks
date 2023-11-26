import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-log-in-page',
  templateUrl: './log-in-page.component.html',
  styleUrls: ['./log-in-page.component.css']
})
export class LogInPageComponent implements OnInit{
  returnUrl!: string;
  constructor(private router: Router, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.returnUrl = '/login';
  }
  loginform = this.formBuilder.group({
    email: ["", [Validators.required, Validators.email]],
    password: ["", Validators.required]
  });

  login() {

    if (this.loginform.valid) {
    this.router.navigate(['/home']);
    } else {
     this.router.navigate([this.returnUrl]);
    }
    
  }

}
