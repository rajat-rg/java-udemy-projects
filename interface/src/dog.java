public class dog extends animal {
    public dog(String name) {
        super(name);
    }
    @Override
    public void eat()
    {
        System.out.println(getName()+" is eating");
    }
    @Override
    public void breathe()
    {
        System.out.println(getName()+" is breathing");
    }
}
