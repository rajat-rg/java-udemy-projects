import java.util.ArrayList;

public class autoUNboxing {
    public static void main(String args[])
    {
        ArrayList<Integer> in = new ArrayList<Integer>(10);

        Integer Int = 10;
        Double dou = 12.5;
        Int.valueOf(23);
        System.out.println(Int);
        for (int i=0;i<10;i++)
        {
            in.add(Int.valueOf(i));
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(i+" ---> "+in.get(i));
        }
        int i = in.indexOf(7);
        System.out.println(i);
    }
}
