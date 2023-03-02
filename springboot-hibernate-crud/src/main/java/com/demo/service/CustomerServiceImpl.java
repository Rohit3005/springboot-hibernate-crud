package com.demo.service;

import com.demo.dao.CustomerDao;
import com.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDaoImpl;

    @Override
    public void saveData(Customer customer) {
        customerDaoImpl.saveData(customer);

    }

    @Override
    public List<Customer> getAllData() {
        return customerDaoImpl.getAllData();
    }

    @Override
    public Customer getDataById(int custId) {
        return customerDaoImpl.getDataById(custId);
    }

    @Override
    public void updateData(int custId, Customer customer) {
        customerDaoImpl.updateData(custId, customer);

    }

    @Override
    public void deleteDataById(int custId) {
        customerDaoImpl.deleteDataById(custId);

    }
}
