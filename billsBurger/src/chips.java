import java.util.Scanner ;
public class chips {
    private String name ;
    private int addPrice , ch=0 ;
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        System.out.println("Enter your choice of chips \n");
        System.out.println("1 -- Lays cream 'n onion  \n");
        System.out.println("2 -- kurkure \n");
        System.out.println("3 -- Lays tomato \n");
        System.out.println("4 -- Plain salted \n");
        System.out.println("5 -- none \n");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1 : this.name = "Lays cream 'n onion";
                this.addPrice = 15 ;
                break;

            case 2 : this.name = "kurkure";
                this.addPrice = 15 ;
                break;

            case 3 : this.name = "lays tomato";
                this.addPrice = 15 ;
                break;

            case 4 : this.name = "Plain salted";
                this.addPrice = 15 ;
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
