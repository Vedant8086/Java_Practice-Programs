import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for(int i = 0;i <= a;i++) {
            for(int space = 1;space <= (a-i);space++) {
                System.out.print(" ");
            }

            for(int j = 1;j<=a;j++) {
                if(i==1 || i == a || j == 1 || j == a) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}