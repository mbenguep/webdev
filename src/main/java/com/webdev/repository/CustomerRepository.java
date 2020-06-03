package com.webdev.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
