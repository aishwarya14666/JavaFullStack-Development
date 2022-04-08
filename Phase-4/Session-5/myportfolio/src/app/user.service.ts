import { Injectable } from '@angular/core';
import { Register } from './register';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

 register:Register

  setData(r:Register)
  {
    this.register=r;
  }
  getData()
  {
    return this.register;
  }
}
