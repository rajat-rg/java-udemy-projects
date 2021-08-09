public class furniture {
    private String name ;
    private int num;

    public furniture(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }
    public void use ()
    {
        System.out.println("Furniture in use :|");
    }
    public void show()
    {
        System.out.println("This is "+this.name);
        System.out.println("Quantity is "+this.num);
    }
}
