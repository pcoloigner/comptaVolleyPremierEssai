package org.pcomeziantou.comptavolley.comptavolleybackend.repositories;

import org.pcomeziantou.comptavolley.comptavolleybackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
