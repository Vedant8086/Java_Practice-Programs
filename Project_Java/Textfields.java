import java.awt.*;
public class Textfields {
    public static void main(String[] args) {
        Frame f = new Frame("NotePad");
        TextField tf = new TextField();
        tf.setBounds(50,50,400,400);  
        f.add(tf);
        Button b = new Button("Submit");
        b.setBounds(50,50,100,100);
        f.add(b);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
