import java.util.Scanner ;
public class Fruits {

    private boolean[] add = {false , false , false} ;
    private int addPrice = 0 ,i ;
    private String[] veg = {"Pineapple" , "Apple" ,"Grape"};
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        for (i=0;i<3;i++) {
            System.out.println("add " + veg[i] + " jam ?");
            add[i] = scan.nextBoolean();
        }

    }

    public void setName() {
        getCh();
    }

    public void getName() {
        for (i=0; i<3;i++)
        {
            if (add[i]==true )
            {
                System.out.println(veg[i] +"\n");
                addPrice +=4;
            }

        }

    }


    public int getAddPrice() {
        return addPrice;
    }
}
