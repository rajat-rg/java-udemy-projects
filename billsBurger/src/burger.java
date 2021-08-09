public class burger
{
    private int price ;
    private String name ;
    private bread bread = new bread() ;
    private meat meat = new meat();
    private lettuce lettuce = new lettuce();
    private veggies veg = new veggies();
    private cheese cheese = new cheese();

    public burger() {
        this.price = 30;
        this.name = "Normal Burger";
    }
    public burger (int price , String name)
    {
        this.price=price;
        this.name=name;
    }




    public void setBread ()
    {
        if(this.name =="Healthy Burger")
            bread.setName("Healthy Burger");
        else
        {
         bread.getCh();
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMeat ()
    {
        meat.setName();
        this.price+=meat.getAddPrice();
    }
    public void setLettuce ()
    {
        lettuce.setName();
        this.price+=lettuce.getAddPrice();
    }
    public void setVeg()
    {
        veg.setName();
        this.price+=veg.getAddPrice();
    }
    public void setCheese ()
    {
        cheese.setName();
        this.price+=cheese.getAddPrice();
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread.getName();
    }

    public String getMeat() {
        return meat.getName();
    }

    public String getLettuce() {
        return lettuce.getName();
    }

    public void getVeg() {
        veg.getName();
    }

    public String getCheese() {
        return cheese.getName();
    }
    public void order ()
    {
        setBread();
        setMeat();
        setCheese();
        setLettuce();
        setVeg();
    }
    public void view()
    {

        System.out.println("Your order is as follows");
        System.out.println("NAME : "+getName());
        System.out.println("PRICE : "+getPrice());
        System.out.println("BREAD : "+getBread());
        System.out.println("MEAT : "+getMeat());
        System.out.println("LETTUCE : "+getLettuce());
        System.out.println("CHEESE : "+getCheese());
        getVeg();
    }
}
