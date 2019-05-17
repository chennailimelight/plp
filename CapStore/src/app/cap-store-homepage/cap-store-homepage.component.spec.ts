import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CapStoreHomepageComponent } from './cap-store-homepage.component';

describe('CapStoreHomepageComponent', () => {
  let component: CapStoreHomepageComponent;
  let fixture: ComponentFixture<CapStoreHomepageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CapStoreHomepageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CapStoreHomepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
