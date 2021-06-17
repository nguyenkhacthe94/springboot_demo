package com.hbs.ship.service;

import com.hbs.ship.model.Customer;
import com.hbs.ship.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer add(Customer customer) {
        customerRepository.save(customer);
        Optional<Customer> foundCustomer = customerRepository.findById(customer.getCustomerId());
        return foundCustomer.orElse(null);
    }

    public Iterable<Customer> findAllByName(String name) {
        return customerRepository.findAllByUsernameLike(name);
    }

    public Customer findById(String id) {
        Optional<Customer> foundCustomer = customerRepository.findById(id);
        return foundCustomer.orElse(null);
    }

    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
