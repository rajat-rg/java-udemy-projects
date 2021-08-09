public class deluxeBurger extends burger
{
    private softDrink sd = new softDrink();
    private chips chips = new chips();
    private int p=super.getPrice();
    public deluxeBurger()
    {
        super(80,"Deluxe Burger");
    }
    @Override
    public void order ()
    {
        super.order();
        setSd();
        setChips();
    }

    public void setSd() {
        sd.setName();
        p+=sd.getAddPrice();
        super.setPrice(p);

    }

    public void setChips() {
        chips.setName();
        p=super.getPrice();
        p+=chips.getAddPrice();
        super.setPrice(p);
    }

    public String  getSd() {
        return sd.getName();


    }

    public String getChips() {
        return chips.getName();
    }
    @Override
    public void view()
    {
        super.view();
        System.out.println("SOFT DRINK : "+getSd());
        System.out.println(("CHIPS : "+ getChips()));
    }
}
