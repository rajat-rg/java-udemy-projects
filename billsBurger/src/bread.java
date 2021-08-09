import java.util.Scanner ;
public class bread {
    private String name ;
    private int addPrice , ch=0 ;
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        System.out.println("Enter your choice of bread \n");
        System.out.println("1 -- Ciabatta roll \n");
        System.out.println("2 -- English roll \n");
        System.out.println("3 -- Onion roll \n");
        System.out.println("4 -- Sesame seed bun \n");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1 : this.name = "Ciabatta roll";
                    this.addPrice = 5 ;
                    break;

            case 2 : this.name = "English roll";
                this.addPrice = 5 ;
                break;

            case 3 : this.name = "Onion roll";
                this.addPrice = 7 ;
                break;

            case 4 : this.name = "Sesame seed bun";
                this.addPrice = 5 ;
                break;

            default: this.name="Ciabatta roll";
                    this.addPrice = 5;
        }
    }

    public void setName(String n)
    {
       if(n=="Healthy Burger")
       {
           this.name="Brown Rye roll";
       }
       else
       {
           getCh();
       }
    }

    public String getName() {
        return name;
    }

    public int getAddPrice() {
        return addPrice;
    }
}
