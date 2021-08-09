public abstract class bird extends animal {
    public bird(String name)
    {
        super(name);
    }

    public void eat()
    {
        System.out.println(getName()+" is eating fine");
    }
    public void breathe()
    {
        System.out.println(getName()+" is breathing fine");
    }
    public abstract void fly();
}
