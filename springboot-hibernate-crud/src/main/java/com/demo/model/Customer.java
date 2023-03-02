package com.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int custId;

    private String custName;

    private long custContactNumber;

    private double custAccBalance;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date custDOB;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getCustContactNumber() {
        return custContactNumber;
    }

    public void setCustContactNumber(long custContactNumber) {
        this.custContactNumber = custContactNumber;
    }

    public double getCustAccBalance() {
        return custAccBalance;
    }

    public void setCustAccBalance(double custAccBalance) {
        this.custAccBalance = custAccBalance;
    }

    public Date getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(Date custDOB) {
        this.custDOB = custDOB;
    }
}
