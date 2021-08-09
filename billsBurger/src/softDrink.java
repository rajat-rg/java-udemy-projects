import java.util.Scanner ;
public class softDrink {
    private String name ;
    private int addPrice , ch=0 ;
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        System.out.println("Enter your choice of soft drink \n");
        System.out.println("1 -- Coca Cola \n");
        System.out.println("2 -- Pepsi \n");
        System.out.println("3 -- Limca \n");
        System.out.println("4 -- Diet Coke \n");
        System.out.println("5 -- Mixed fruit juice");
        System.out.println("6 -- none \n");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1 : this.name = "Coca Cola";
                this.addPrice = 12 ;
                break;

            case 2 : this.name = "Pepsi";
                this.addPrice = 12 ;
                break;

            case 3 : this.name = "Limca";
                this.addPrice = 12 ;
                break;

            case 4 : this.name = "Diet Coke";
                this.addPrice = 20 ;
                break;

            case 5 : this.name = "Mixed Fruit Juice";
                this.addPrice = 25 ;
                break;
            default: this.name=null;
                this.addPrice = 0;
        }
    }

    public void setName() {
        getCh();
    }

    public String getName() {
        return name;
    }

    public int getAddPrice() {
        return addPrice;
    }


}
