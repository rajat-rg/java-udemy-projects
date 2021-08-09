package com.company;

import com.company.Customer;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branches = new ArrayList();
    }

    public void addBranch(String branchName)
    {
        if(findBranch(branchName) == null)
        {
            Branch newBranch = new Branch(branchName);
            this.branches.add(newBranch);
        }
        else
            System.out.println("Branch already exists by the name "+branchName+".");
    }

    private Branch findBranch(String name)
    {
        for(int i=0;i< this.branches.size();i++)
        {
            if (this.branches.get(i).getBranchName().equals(name)){
                return this.branches.get(i);
            }

        }
        return null;
    }



    public void addCustomer(String branchName, String customerKaNaam, double transactions)
    {  Branch branch = findBranch(branchName);
        if(branch != null)
        {
            branch.newCustomer(customerKaNaam,transactions);
        }
        else
            System.out.println("Branch by the name"+branchName+" does not match");
    }

    public void addCustomerTransaction(String branchName, String customerKaNaam, double transactions)
    {  Branch branch = findBranch(branchName);
        if(branch != null)
        {
            branch.addCustomerTransaction(customerKaNaam,transactions);
        }
        else
            System.out.println("Branch by the name"+branchName+" does not match");
    }
    public void showBranchCustomers (String branchName, boolean transactions)
    {
        Branch branch = findBranch(branchName);
        if(branch != null)
        {
            System.out.println("Customers in branch :"+ branch.getBranchName());
            ArrayList<Customer> allCustomer = new ArrayList<>();
            allCustomer = branch.getCustomers();
            for(int i=0;i<allCustomer.size();i++)
            {
                System.out.println(i+1 +": "+allCustomer.get(i).getName() );
                if(transactions)
                {
                    for(int j=0;j<allCustomer.get(i).getTransactions().size(); j++)
                    {
                        System.out.println("   ->"+j+1 +": "+ allCustomer.get(i).getTransactions().get(j));
                    }

                }

            }

        }
    }
}
