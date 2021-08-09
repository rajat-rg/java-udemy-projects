import java.util.Scanner ;
public class cheese {
    private String name ;
    private int addPrice , ch=0 ;
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        System.out.println("Enter your choice of cheese \n");
        System.out.println("1 -- Cheddar \n");
        System.out.println("2 -- Blue cheese \n");
        System.out.println("3 -- Gouda \n");
        System.out.println("4 -- Mild cheddar \n");
        System.out.println("5 -- none \n");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1 : this.name = "Cheddar";
                this.addPrice = 5 ;
                break;

            case 2 : this.name = "Blue cheese";
                this.addPrice = 5 ;
                break;

            case 3 : this.name = "Gouda";
                this.addPrice = 5 ;
                break;

            case 4 : this.name = "Mild cheddar";
                this.addPrice = 5 ;
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
