package com.mohammedaltwaity.ecommerce.dao;

import com.mohammedaltwaity.ecommerce.entity.Customer;
import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
