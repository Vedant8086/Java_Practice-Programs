import java.net.*;
public class Datagram_reciever {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(2000);
        byte[] buf = new byte[5000];
        DatagramPacket dp = new DatagramPacket(buf,5000);
        ds.receive(dp);
        String str = new String(buf);
        System.out.println(str);
        ds.close();
    }
}
