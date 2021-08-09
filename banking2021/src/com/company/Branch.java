package com.company;

import com.company.Customer;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();

    }

    public void newCustomer(String name, double transaction)
    {
        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, transaction));
        }
        else{

            System.out.println("User already exists by this name!!");
        }
    }
    public void addCustomerTransaction(String name,double transaction)
    {
        Customer customer = findCustomer(name);
        if(customer != null)
        {
            customer.addTransaction(transaction);
        }
        else
        System.out.println("oops! this user does not exists");
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }

    public Customer findCustomer (String name)
    {
        for(int i=0;i<this.customers.size();i++)
        {
            if(this.customers.get(i).getName().equals(name))
            {
                return this.customers.get(i);
            }
        }
        return null;
    }
}
