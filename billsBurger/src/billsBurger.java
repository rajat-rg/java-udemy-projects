import java.util.Scanner;

public class billsBurger {
    public static void main(String args[])
    {

        int a;
        String n , Cname;
        System.out.println("Enter your name \n");
        Scanner scan = new Scanner(System.in);
        Cname =scan.nextLine();


        System.out.println("Choose a burger");
        System.out.println("1 --> Normal burger @ 30");
        System.out.println("2 --> Healthy burger @ 50");
        System.out.println("3 --> Deluxe burger @ 80");
        a=scan.nextInt();
        healthyBurger hb = new healthyBurger();
        burger nb = new burger();
        deluxeBurger db=new deluxeBurger();

        switch(a)
        {
            case 1 : nb.order();
                System.out.println(Cname);
                    nb.view();
                break;
            case 2 : hb.order();
                System.out.println(Cname);
                    hb.view();
                break;
            case 3 :
                db.order();
                System.out.println(Cname);
                db.view();
                break;
            default :
                n=null;

        }

    }


}
