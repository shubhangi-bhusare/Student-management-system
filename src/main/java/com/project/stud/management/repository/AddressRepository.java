package com.project.stud.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.stud.management.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>
{

}
