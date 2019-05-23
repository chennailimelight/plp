import { Component, OnInit, Input } from '@angular/core';
import { Feedback } from '../feedback';

@Component({
  selector: 'app-feedback-detail',
  templateUrl: './feedback-detail.component.html',
  styleUrls: ['./feedback-detail.component.css']
})
export class FeedbackDetailComponent implements OnInit {
  
  @Input() feedback:Feedback;

  constructor() { }

  ngOnInit() {
  }

}
