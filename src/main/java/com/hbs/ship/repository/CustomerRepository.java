package com.hbs.ship.repository;

import com.hbs.ship.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {
    Iterable<Customer> findAllByUsernameLike(String username);


}
