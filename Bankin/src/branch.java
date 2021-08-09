import java.util.ArrayList;
import java.util.Scanner;
public class branch
{

    private String branchName ;
    private ArrayList<customer> customer = new ArrayList<>();

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    Scanner scan = new Scanner (System.in);
    public void setCustomer()
    {

        String name ;
         double tr ;
        System.out.println("Enter  Customer Name");
        name=scan.nextLine();

        System.out.println("Enter initial transaction Amount");
        tr = scan.nextDouble();
        scan.nextLine();

        boolean ex = customer.contains(name);
        if (ex ==  true)
        {
            System.out.println("This customer already exists ---- can't add again");
        }
        else
        {
            customer newCustomer = new customer ();
            newCustomer.setName(name);
            newCustomer.setTransaction(tr);
            customer.add(newCustomer);
        }
    }
    private boolean find(String Cname )
    {
        for (int i=0;i<this.customer.size();i++)
        {
            if (this.customer.contains(Cname))
            {
                this.customer.get(i).setAdditionalTransactions();
                return true ;
            }
        }
        return false ;
    }
    public void addtranscation(String Cname)
    {
        boolean s=find(Cname);
        if(s)
        {
            System.out.println("Added transaction successfully");
        }
        else
            System.out.println("Transaction could not be added");
    }



}
