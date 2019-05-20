import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MerchantidComponent } from './merchantid.component';

describe('MerchantidComponent', () => {
  let component: MerchantidComponent;
  let fixture: ComponentFixture<MerchantidComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MerchantidComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MerchantidComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
