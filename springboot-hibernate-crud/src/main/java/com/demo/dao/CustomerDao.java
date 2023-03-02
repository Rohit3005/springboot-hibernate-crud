package com.demo.dao;

import com.demo.model.Customer;

import java.util.List;

public interface CustomerDao {

    public void saveData(Customer customer);

    public List<Customer> getAllData();

    public Customer getDataById(int custId);

    public void updateData(int custId, Customer customer);

    public void deleteDataById(int custId);
}
