import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        player jin = new player("JIN" , 20,35);
        System.out.println(jin.toString());
        saveObject(jin);

        loadObject(jin);
        System.out.println(jin);
    }
    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        int index = 0 ;
        boolean quit = false ;
        System.out.println("Choose\n " +
                "1 -- Enter a string " +
                "0 -- To QUIT");


        while (! quit)
        {
            System.out.println("Choose an option :");
            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice)
            {
                case 0 :
                    quit = true ;;
                    break ;
                case 1 :
                    System.out.println("Enter a string");
                    String stringInput = scan.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;

             }
        }
        return values;
    }


    public static void saveObject(ISaveable save)
    {
        for(int i =0;i<save.write().size();i++)
        {
            System.out.println("Saving "+save.write().get(i) +" to storage device");
        }
    }

    private static void loadObject(ISaveable load)
    {
        ArrayList<String> values =  readValues();
        load.read(values);
    }
}