import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Register } from '../register';

import { UserService } from '../user.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor(private formBuilder:FormBuilder,
    private service:UserService,private router:Router) { }
    registerForm: FormGroup;
    userData:Register=new Register();
    submitted:boolean=false;
    ngOnInit():void{
      this.registerForm=this.formBuilder.group({
        firstName:['',Validators.required],
        lastName:['',Validators.required],
        email:['',[Validators.required,Validators.email]],
        qualification:['',Validators.required],
        skills:['',Validators.required]
      })
    }

    get f(){
      return this.registerForm.controls;
    }
    onSubmit(){
      this.submitted=true;

      if(this.registerForm.invalid)
      return;
      else{
        this.service.setData(this.userData);

        this.router.navigateByUrl('/details');
      }
      }

    }