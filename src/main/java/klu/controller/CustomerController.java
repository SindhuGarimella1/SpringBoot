package klu.controller;

import klu.model.CustomerManager;
import klu.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    // Get all customers
    @GetMapping
    public List<CustomerManager> getAllCustomers() {
        return customerRepository.findAll();
    }
}
