import java.util.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Practice");

        Button b = new Button("Click ME");
        b.setBounds(100,200,100,50);
        Label lb = new Label();
        lb.setBounds(50,50,150,20);
        String host = "www.youtube.com";
        f.add(b);
        f.add(lb);
        lb.setText("IP of youtube is ");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }
}
