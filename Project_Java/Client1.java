import java.io.IOException;
import java.net.Socket;
import java.io.*;
public class Client1 {
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost",6666);
    }
}
