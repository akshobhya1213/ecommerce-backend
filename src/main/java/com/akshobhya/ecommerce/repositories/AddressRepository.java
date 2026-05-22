package com.akshobhya.ecommerce.repositories;

import com.akshobhya.ecommerce.model.Address;
import com.akshobhya.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findAddressByUser(User user);
}
