public class appliances {
    private String name ;
    private int num ;
    private boolean isOn ;

    public appliances(String name, int num,boolean isOn) {
        this.name = name;
        this.num = num;
        this.isOn=isOn;
    }
    public void turnON () {
        if (isOn == true)
            System.out.println(this.name +" already in ON state");
        else
        {
            System.out.println(this.name +" turning ON");
            isOn=true;
        }
    }

    public void turnOFF ()
    {
        if (isOn == true )
            System.out.println(this.name+" turning OFF");
        else
            System.out.println(this.name+" isaAlready  in OFF state");
    }

    public void show()
    {
        System.out.println("This is "+this.name);
        System.out.println("Quantity is "+this.num);
    }
}
