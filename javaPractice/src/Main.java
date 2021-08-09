import java.util.Scanner;
public class Main {
   /* public static void main(String args[])
    {
        furniture chair = new furniture("chair",2);
        furniture bed = new furniture("bed",1);
        appliances fan = new appliances("fan", 1,false);
        appliances light = new appliances("light", 1,false);
        room room1 = new room(chair,bed,fan,light);
        room1.showoff();
        room1.turnON();
        room1.getFan().turnOFF();


    }*/
    public static void main(String args [])
    {
       printer printer = new printer (50,true);
        System.out.println("Initial pge count =" +printer.getPages());
        int pages = printer.printPage(4);
        System.out.println("Pages printed was " +pages+" new total pages count for printer ="+ printer.getPages());

    }

}
