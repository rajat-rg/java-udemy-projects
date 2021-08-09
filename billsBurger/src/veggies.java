import java.util.Scanner ;
public class veggies {
    Scanner scan = new Scanner (System.in);
    private boolean[] add = {false , false , false} ;
    private int addPrice =0 ,i ;
    private String[] veg = {"Tomato" , "Onion" ,"Carrot"};

    public void getCh()
    {
        for (i=0;i<3;i++) {
            System.out.println("add " + veg[i] + " ?");
            add[i] = scan.nextBoolean();
        }

    }

    public void setName() {
        getCh();
    }

    public void getName() {
        System.out.println("VEGGIES :");
        for (i=0; i<3;i++)
        {
            if (add[i]==true )
            {
                System.out.println(veg[i] +"\r");
                addPrice +=2;
            }

        }
    }

    public int getAddPrice() {
        return addPrice;
    }
}
