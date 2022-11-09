import java.io.*;
import java.net.*;
public class MyServer {
    public static void main(String[] args) {
        try {
            System.out.println("halo");
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("2");
            Socket s = ss.accept();// establishes connection
            System.out.println("34");
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
