import java.util.ArrayList;
import java.util.Scanner ;
public class bank {

    String name;

    public bank(String name) {
        this.name = name;
    }

    ArrayList<branch> branch = new ArrayList<>();
    Scanner scan = new Scanner (System.in);
    public void newBranch()
    {
        branch br = new branch("No_name");
        String name;
        System.out.println("Enter new branch name");
        name = scan.nextLine();
        //error inda next line ....... contains nt workin properli
        boolean ex = branch.contains(name);
        if(!ex  )
        {
            br.setBranchName(name);
            branch.add(br);
        }
        else
        {
            System.out.println("Branch with same name exists already ");

        }

        System.out.println("branch name set to --> "+br.getBranchName());

    }
    public void addCustomer()
    {
        System.out.println("Enter branch name");
        String brname= scan.nextLine();
        //error inda next line ....... indexOf nt workin properli
        int i =branch.indexOf(brname);
        System.out.println(i);
        if(i>=0)
        {
            this.branch.get(i).setCustomer();
        }
        else
            System.out.println("already exists , can't add");

        System.out.println("Customer added --");
    }
    public void show ()
    {
        for(int i=0;i<branch.size() ; i ++)
        {
            System.out.println(i+1 + ". "+branch.get(i).getBranchName());
        }
    }


}
