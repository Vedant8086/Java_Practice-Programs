import java.net.*;
public class Datagram_sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome To Java";
        InetAddress ip = InetAddress.getByName("localhost");
        int port = 2000;
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(),ip,port);
        ds.send(dp);
        ds.close();
    }
}
