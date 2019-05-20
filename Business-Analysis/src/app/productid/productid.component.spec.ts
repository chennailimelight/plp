import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductidComponent } from './productid.component';

describe('ProductidComponent', () => {
  let component: ProductidComponent;
  let fixture: ComponentFixture<ProductidComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProductidComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProductidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
