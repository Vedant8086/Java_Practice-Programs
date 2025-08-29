import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_Message2 {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",5999);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("Is the All things Are Working ?? ");
        pr.flush();


        InputStreamReader ips = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(ips);

        String strs = bf.readLine();
        System.out.println("Server Response  : "+strs);
    }
    
}
