import { TestBed } from '@angular/core/testing';

import { MerchantidService } from './merchantid.service';

describe('MerchantidService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MerchantidService = TestBed.get(MerchantidService);
    expect(service).toBeTruthy();
  });
});
