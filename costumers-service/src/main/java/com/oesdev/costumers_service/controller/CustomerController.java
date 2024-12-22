package com.oesdev.costumers_service.controller;

import com.oesdev.costumers_service.dto.CustomerDto;
import com.oesdev.costumers_service.service.ICustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final ICustomerService service;

    public CustomerController(ICustomerService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createCustomer(@RequestBody CustomerDto customerDto) {
        return new ResponseEntity<>(this.service.createCostumer(customerDto), HttpStatus.CREATED);
    }

    @GetMapping("/read/{customer_id}")
    public ResponseEntity<CustomerDto> readCustomer(@PathVariable Long customer_id) {
        return new ResponseEntity<>(this.service.readCostumer(customer_id), HttpStatus.OK);
    }

    @GetMapping("/read")
    public ResponseEntity<List<CustomerDto>> readCustomers() {
        return new ResponseEntity<>(this.service.readCostumers(), HttpStatus.OK);
    }

    @PatchMapping("/update/{customer_id}")
    public ResponseEntity<String> updateCustomer(@PathVariable Long customer_id, @RequestBody CustomerDto customerDto) {
        return new ResponseEntity<>(this.service.updateCostumer(customer_id, customerDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{customer_id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long customer_id) {
        return new ResponseEntity<>(this.service.deleteCostumer(customer_id), HttpStatus.OK);
    }

}
