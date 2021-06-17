package com.hbs.ship.controller;

import com.hbs.ship.model.Customer;
import com.hbs.ship.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("/list")
    public List<Customer> showCustomerList() {
        List<Customer> customers = new ArrayList<>();
//        customers.add(new Customer("C0001", "hayden", "jimmy"));
//        customers.add(new Customer("C0002", "jimmy", "envyus"));
        return customers;
    }

    @GetMapping("/new")
    public ModelAndView createNewCustomerForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/new");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/new")
    public Customer addNewCustomer(@ModelAttribute Customer customer) {
        return customerService.add(customer);
    }

    @GetMapping("/search")
    public ModelAndView searchCustomer() {
        return new ModelAndView("/customer/search");
    }

    @PostMapping("/search")
    public Iterable<Customer> searchCustomerList(@RequestParam String username) {
        return customerService.findAllByName(username);
    }

    @GetMapping("/{id}")
    public Customer searchById(@PathVariable String id) {
        return customerService.findById(id);
    }

    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        customerService.delete(id);
    }
}
