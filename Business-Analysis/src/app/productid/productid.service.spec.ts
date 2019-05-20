import { TestBed } from '@angular/core/testing';

import { ProductidService } from './productid.service';

describe('ProductidService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProductidService = TestBed.get(ProductidService);
    expect(service).toBeTruthy();
  });
});
