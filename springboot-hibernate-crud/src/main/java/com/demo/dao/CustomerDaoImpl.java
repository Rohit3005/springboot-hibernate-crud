package com.demo.dao;

import com.demo.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDaoImpl implements CustomerDao {

    private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

    @Override
    public void saveData(Customer customer) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);
        transaction.commit();

    }

    @Override
    public List<Customer> getAllData() {
        Session session = factory.openSession();
        return session.createQuery("from Customer").list();
    }

    @Override
    public Customer getDataById(int custId) {
        Session session = factory.openSession();

        return (Customer) session.get(Customer.class, custId);
    }

    @Override
    public void updateData(int custId, Customer customer) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Customer customer1 = getDataById(custId);
        customer1.setCustName(customer.getCustName());
        customer1.setCustContactNumber(customer.getCustContactNumber());
        customer1.setCustAccBalance(customer.getCustAccBalance());
        customer1.setCustDOB(customer.getCustDOB());

        session.update(customer1);
        transaction.commit();

    }

    @Override
    public void deleteDataById(int custId) {

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = getDataById(custId);
        session.delete(customer);
        transaction.commit();

    }
}
