public class car {
    private boolean engine ;
    private int wheels , cylinder ,acce ;

    public car(int cylinder) {
        this.engine = true;
        this.wheels = 4;
        this.cylinder = cylinder;
        this.acce=0;
    }
    public void accelerate ( int acc)
    {
        this.acce +=acc;
        System.out.println("Car accelerated at " +this.acce);
    }
    public void start ()
    {
        System.out.println("Whoooom....... started :)");
    }
    public void breaks ()
    {
        this.acce=0;
        System.out.println("Stopped ........");
    }

    public int getAcce() {
        return acce;
    }
}

class ford extends car
{
    private String name ;

    public ford(int cylinder, String name) {
        super(cylinder);
        this.name = name;
    }
    @Override
    public void start ()
    {
        System.out.println(this.name +"started engine \n acceleration at "+getAcce());
    }

}
class hondacity extends car
{
    private String name ;

    public hondacity(int cylinder, String name) {
        super(cylinder);
        this.name = name;
    }
    public void start ()
    {
        System.out.println(this.name +" started engine wroooom .....wroooom \n acceleration at "+getAcce());
    }

}
class Main
{
    public static void main(String args[])
    {
        car my = new car (2);
        my.accelerate(20);
        ford f = new ford (4,"ecoSport");

        f.start();
        f.accelerate(20);
        hondacity h = new hondacity(4,"beastSumo");

        h.start();
        h.accelerate(20);
    }
}