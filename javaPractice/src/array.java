import java.util.Scanner;
public class array {


    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        int[] a = new int[7];
        System.out.println("Enter numbers in array \n");
        for (int i =0; i < a.length;i++)
        {
            a[i]=scan.nextInt();
            scan.nextLine();
        }
        scan.close();
        QuickSort qs= new QuickSort();

        qs.sort(a,0,a.length-1);
        System.out.println("Sorted array :");

        for(int i=0;i<a.length;i++)

        {
            System.out.print(a[i]+"\t");
        }


    }
     }
