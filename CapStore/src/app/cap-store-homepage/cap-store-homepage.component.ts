import { Component, OnInit,ViewChild } from '@angular/core';
import {SlideshowModule} from 'ng-simple-slideshow';

@Component({
  selector: 'app-cap-store-homepage',
  templateUrl: './cap-store-homepage.component.html',
  styleUrls: ['./cap-store-homepage.component.css']
})
export class CapStoreHomepageComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  @ViewChild('slideshow') slideshow: any;
  




}
