import java.io.*;
import java.net.*;
public class client {

    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",8000);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("hello server");
            dout.flush();
            s.close();

        }
        catch(Exception e)
        {
            System.out.println("Some problem occurred "+e);
        }
    }


}
