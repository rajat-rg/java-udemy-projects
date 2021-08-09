import java.util.Scanner ;
public class lettuce {
    private String name ;
    private int addPrice , ch=0 ;
    Scanner scan = new Scanner (System.in);
    public void getCh()
    {
        System.out.println("Enter your choice of lettuce \n");
        System.out.println("1 -- Cabbage \n");
        System.out.println("2 -- Leaf lettuce \n");
        System.out.println("3 -- Butterhead lettuce \n");
        System.out.println("4 -- Iceberg lettuce \n");
        System.out.println("5 -- none \n");
        ch=scan.nextInt();
        switch(ch)
        {
            case 1 : this.name = "Cabbage";
                this.addPrice = 0 ;
                break;

            case 2 : this.name = "leaf lettuce";
                this.addPrice = 0 ;
                break;

            case 3 : this.name = "Butterhead lettuce";
                this.addPrice = 0 ;
                break;

            case 4 : this.name = "Iceberg lettuce";
                this.addPrice = 0 ;
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
