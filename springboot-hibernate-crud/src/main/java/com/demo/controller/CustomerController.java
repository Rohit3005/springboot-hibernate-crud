package com.demo.controller;

import com.demo.model.Customer;
import com.demo.service.CustomerService;
import org.jboss.logging.annotations.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {

    @Autowired
    CustomerService customerServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(@RequestBody Customer customer) {
        customerServiceImpl.saveData(customer);
        return ResponseEntity.ok("DATA SAVED");
    }

    @GetMapping("/getalldata")
    public ResponseEntity<List<Customer>> getAllData() {
        return ResponseEntity.ok(customerServiceImpl.getAllData());
    }

    @GetMapping("/getdatabyid/{custId}")
    public ResponseEntity<Customer> getDataById(@PathVariable int custId) {
        return ResponseEntity.ok(customerServiceImpl.getDataById(custId));
    }

    @PutMapping("/updatedata/{custId}")
    public ResponseEntity<String> updateData(@PathVariable int custId, @RequestBody Customer customer) {
        customerServiceImpl.updateData(custId, customer);
        return ResponseEntity.ok("DATA UPDATED");
    }

    @DeleteMapping("/deletebyid/{custId}")
    public ResponseEntity<String> deleteDataById(@PathVariable int custId) {
        customerServiceImpl.deleteDataById(custId);
        return ResponseEntity.ok("DATA DELETED");
    }

}
