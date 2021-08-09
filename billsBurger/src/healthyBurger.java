import  java.util.Scanner ;
public class healthyBurger extends burger
{
    private Fruits fruit = new Fruits();
    private int p=super.getPrice();
    public healthyBurger() {
        super(50,"healthy burger");


    }

    @Override
    public void order ()
    {
        super.order();
        setFruit();
    }
    public void setFruit() {
        fruit.setName();
        p+=fruit.getAddPrice();
        super.setPrice(p);

    }

    public Fruits getFruit() {
        return fruit;
    }
    @Override
    public void view()
    {
        super.view();
        System.out.println("FRUITS : ");
        fruit.getName();
    }

}
