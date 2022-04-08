import { Component, OnInit } from '@angular/core';
import { Register } from '../register';
import { UserService } from '../user.service';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

  constructor(private service: UserService) { }

  register:Register
  ngOnInit(): void {

    this.register=this.service.getData();

  }

}

