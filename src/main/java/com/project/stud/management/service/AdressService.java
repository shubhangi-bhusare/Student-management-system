package com.project.stud.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.stud.management.entity.Address;
import com.project.stud.management.repository.AddressRepository;

@Service
public class AdressService 
{
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional
	public Address save(Address address) {
		return addressRepository.save(address);
	}
}
