import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> grocery =new ArrayList<>();
        System.out.println("Enter grocery items");
        getList(grocery);
        System.out.println("Grocery list contains :");
        showList(grocery);
        modify(grocery);
        showList(grocery);
    }
    private static void modify(ArrayList<String> grocery)
    {
        System.out.println("Enter position to modify");
        int pos= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter new item name");
        String item = scan.nextLine();
        grocery.set(pos, item);


    }

    private static void getList(ArrayList<String> grocery)
    {
        for(int i=0;i<6;i++)
        {
            grocery.add(scan.nextLine());
        }
    }
    private static void showList(ArrayList<String> grocery)
    {
        for(int i=0;i<grocery.size();i++)
        {
            System.out.println(i+1+" > "+grocery.get(i));
        }
    }
}
