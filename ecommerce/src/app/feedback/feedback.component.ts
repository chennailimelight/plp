import { Component, OnInit } from '@angular/core';
import { Feedback } from '../feedback';
@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {

  feedback : Feedback = {
    experience: "good",
    comments:"This product is of good quality",
    custname:"Siddharth",
    email:"email@gmail.com",
  }
  
  constructor() { }

  selectedFeedback: Feedback;
  onSelect(feedback: Feedback): void {
    this.selectedFeedback = feedback;
  }
  

  ngOnInit() {
  }

}
