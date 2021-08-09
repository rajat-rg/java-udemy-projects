package com.company;

public class Main {

    public static void main(String[] args) {
	Bank hdfc = new Bank("HDFC Bank");
	hdfc.addBranch("anoopshahr");

	hdfc.addCustomer("anoopshahr", "Ravi Chauhan",5000.0);
	hdfc.addCustomer("anoopshahr", "Abdullah sheikh",50.0);
	hdfc.addCustomer("anoopshahr", "Priyanka chaudhary",4596.0);

	hdfc.addBranch("Hapur");
	hdfc.addCustomer("Hapur", "Shlok Thakur",5000.0);
	hdfc.addCustomer("Hapur", "Rehman Ali",50.0);
	hdfc.addCustomer("Hapur", "Khushboo Garg",4596.0);

	hdfc.addCustomerTransaction("Hapur","Khushboo Garg",500.0);
	hdfc.showBranchCustomers("anoopshahr",true);
	hdfc.showBranchCustomers("Hapur",true);
    }
}
