public class main {
    public static void main(String args[])
    {
        branch br = new branch("no");
        branch br2 = new branch("no");
        bank sbi= new bank ("SBI");
        sbi.newBranch();
        sbi.newBranch();
        sbi.addCustomer();
       sbi.show();

    }
}
