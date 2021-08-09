public abstract class animal {
    public String name;

    public animal(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void breathe();

    public String getName()
    {
        return name;
    }
}
