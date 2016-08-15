package com.hand.service;

import com.hand.dto.Address;

public interface AddressService {
	public String getAddressName(int id);
	public Address checkAddressId(int id);
}
