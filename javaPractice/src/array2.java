import java.util.Scanner;
public class array2 {
   private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        int count ;

        System.out.println("Enter number of elements in array");
        count=scan.nextInt();
        scan.nextLine();
        int[] array = new int[count];

        getArray(count, array);
        System.out.println("Minimum number is "+getMinimum(count, array));
        print(array);
        reverse(array);
        System.out.println("\nReverse array is :");
        print(array);


    }
    private static void print(int[] array)
    {
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"\t");

    }
    private static void getArray(int count, int[] array)
    {
        System.out.println("Enter numbers in array");
        for(int i=0;i<count;i++)
        {
            array[i]=scan.nextInt();
            scan.nextLine();
        }

    }
    private static int getMinimum(int count, int[] array)
    {
        int min = Integer.MAX_VALUE;
        for (int i=0 ;i<count ;i++)
        {
            if(array[i] <min)
            {
                min=array[i];

            }


        }
        return min;
    }
    private static void reverse (int[] array)
    {
        int i;
        for (i=0;i<array.length/2;i++)
        {
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i] = temp;

        }
    }
}
