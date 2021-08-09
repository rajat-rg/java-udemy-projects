public class link {
    private static  class node
    {
        int data ;
         node next =null ;

    }
   private static node start= null , last  ;

    public static void main(String[] args)
    {

        traverse();
        for (int i =0 ;i <6;i++)
        {
            addNode(i+1);

        }
        traverse();
        remove(2);
        update(5,42);
        traverse();

    }

    private static void traverse ()
    {
        node tmp = start ;
        if (tmp == null)
        {
            System.out.println("Empty linked list");
            return ;
        }
        while(tmp.next != null)
        {
            System.out.print(tmp.data+" -> ");
            tmp=tmp.next;
        }
        System.out.println();
    }

    public static void update(int num , int newNum) {
        node node = start ;
        if (node == null)
        {
            System.out.println("Empty linked list");
            return ;

        }
        else if(node != last)
        {
            while (node.next != null)
            {
                if(node.data== num)
                {
                    node.data = newNum;

                    return ;
                }
                node= node.next;
            }
        }
        else
        {
            System.out.println("Number not found in linked list");
            return ;
        }



    }

    private static void addNode(int d) {
        node newNode = new node();
        newNode.data = d;
        if (start == null) {
            start = newNode;
            last = start;
        }

        else
        {
            last.next= newNode ;
            last = newNode ;
        }
    }

    private static void remove( int num)
    {
        node temp , del;
        temp=start ;
        if (temp == null)
        {
            System.out.println("Empty linked list");
            return ;
        }
        else
        {
            while (temp.next != null)
            {
                if(temp.next.data == num)
                {
                    del =temp.next;
                    temp.next= temp.next.next;
                    del=null;
                    return ;

                }
                else
                {
                    temp = temp.next;
                }

            }
        }
        System.out.println("Number not found ");

    }


}
