import java.util.ArrayList;
import java.util.Scanner;

public class customer
{
    private String name ;
    private ArrayList<Double> transaction = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public customer() {
        super();
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void setTransaction(double tr)
    {
        this.transaction.add(tr);
    }

    public customer(String name, double initialTrans) {
        this.name = name;
        setTransaction(initialTrans);
    }
    public void setAdditionalTransactions()
    {
        double tr;
        System.out.println("Enter Additional transaction");
        tr=scan.nextDouble();
        scan.nextLine();
        this.setTransaction(tr);

    }

}
