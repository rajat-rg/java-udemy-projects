import java.util.Scanner;

public class meat
{
    private String name ;
    private int addPrice , ch=0 ;
    private boolean wantMeat;
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        System.out.println("Enter your choice of meat \n");
        System.out.println("1 -- Chicken \n");
        System.out.println("2 -- Chuck steak \n");
        System.out.println("3 -- Bacon \n");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1 : this.name = "Chicken";
                this.addPrice = 7 ;
                break;

            case 2 : this.name = "Chuck steak";
                this.addPrice = 7 ;
                break;

            case 3 : this.name = "Bacon";
                this.addPrice = 7 ;
                break;


            default: this.name="potato patty";
                this.addPrice = 3;
        }
    }

    public void setName() {
        System.out.println("Want meat ? (true/false)");
        wantMeat= scan.nextBoolean();
        if(wantMeat == true)
            getCh();
        else {
            this.name = "Potato patty";
            this.addPrice=4;
        }
    }

    public String getName() {
        return name;
    }

    public int getAddPrice() {
        return addPrice;
    }
}

