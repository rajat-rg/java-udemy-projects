package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList transactions;

    public Customer(String name, double transactions) {
        this.name = name;
        this.transactions = new ArrayList();
        addTransaction(transactions);
    }
    public void addTransaction(double transaction)
    {
        this.transactions.add(transaction);

    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
}
