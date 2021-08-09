import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args)
    {
        try{
            ServerSocket s = new ServerSocket(8000);
            System.out.println("waiting for connection....");
            Socket so = s.accept();
            System.out.println("Connection Established");
            DataInputStream dis = new DataInputStream(so.getInputStream());
            String str = (String)dis.readUTF();
            System.out.println("Message "+str);
            so.close();
        }
        catch(Exception e)
        {
            System.out.println("Problem connecting ...." + e);

        }
    }
}
