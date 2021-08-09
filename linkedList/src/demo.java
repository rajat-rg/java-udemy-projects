import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class demo {
    public static LinkedList<Integer> list = new LinkedList<Integer>();
    public static void main(String[] args) {



        for (int i=0;i<6;i++)
        {
            list.add(i+2);
        }

        printList(list);
        remove(7);
        printList(list);
        addAfter(5,67);
        printList(list);
        traverse();
    }
    private static boolean addAfter(int index, int number)
    {

        if(list.isEmpty())
        {
            list.add(number);
            return true ;
        }
        if(list.indexOf(index)<0)
        {
            return false ;
        }

        int i = list.indexOf(index);
        list.add(i+1,number);
        return true ;
    }


    private static void printList (LinkedList list)
    {
        if (list.isEmpty())
        {
            System.out.println("---Empty list--- ");
        }
        else
        {
            Iterator<Integer> i = list.iterator();
            while(i.hasNext()) {
                System.out.print(i.next() + "->");
            }
            System.out.println();

        }

    }


    private static void traverse()
    {
        Scanner scan = new Scanner(System.in);
        ListIterator i = list.listIterator();
        System.out.println("Traversal in action \n press :\n" +
                "0 -- quit\n" +
                "1 -- next\n" +
                "2 -- previous\n");
        while (true)
        {
            int a = scan.nextInt();

            boolean f = true ; //stands dor forward when true
            switch (a)
            {
                case 0 : return ;
                case 1 :

                    if(!f)
                    {
                        if(i.hasNext())
                        {
                            i.next();
                        }
                        f=true ;
                    }
                    if(i.hasNext())
                    {
                        System.out.println(i.next());
                    }
                    else
                    {
                        System.out.println("We reached in end of linked list");
                    }
                    break;
                case 2 :
                    if(f)
                    {
                      if(i.hasPrevious())
                      {
                          i.previous();
                      }
                      f=false  ;
                    }
                    if (i.hasPrevious())
                    {
                        System.out.println(i.previous());
                    }
                    else
                    {
                        System.out.println("We reached in the start of linked list");
                    }
                    break;
            }


        }

    }

    private static boolean remove( int n) {
        Iterator i = list.iterator();
        while(i.hasNext())
        {

            if ( i.next().equals(n))
            {

                int index=list.indexOf(n);
                list.remove(index);
                System.out.println("Removed successfully");
                return true;
            }

        }

        System.out.println("No such number was found");
        return false ;
    }
}