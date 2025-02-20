import java.awt.*;
import java.lang.*;
import java.util.*;

class XMain {
    public static void main(String[] args) {
        System.out.println("Hello,World!!");
        System.out.println("String Exception "+" : Loaded ");
        Frame xframe = new Frame("X : Super Computer");
        xframe.setBounds(500, 500, 700, 700);
        xframe.setVisible(true);
        xframe.setResizable(true);
        Label first = new Label("The First thing : ");
        Button firsButton = new Button("Click For Submit");
        firsButton.setBounds(50, 50, 150, 40);
        xframe.add(firsButton);
        Checkbox firstCheckbox = new Checkbox("Learned C++ Language", false);
        firstCheckbox.setVisible(true);
        firstCheckbox.setBounds(160, 160, 20, 10);
        xframe.add(firstCheckbox);
        xframe.add(first);


    }
    
}
