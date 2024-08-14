import java.util.*;
public class Ikea {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int a1 = a,a2 = a,a3 = a;
        int spaces = 2 * a - 1;
        for(int i = 1;i<=a+1;i++) {
            for(int j = 1;j<=i;j++) {
                System.out.print(a1 + " ");
                a1 -= 1;
            }
            for(int j1 = 1;j1 <=spaces;j1++) {
                System.out.print("  ");
            }
            for(int j5 = 1;j5 <=i;j5++) {
                System.out.print(" " + a3);
                a3+=1;
                
            }
            System.out.print("\n");
            a1 = a;
            a3 = a-i;
            spaces -= 2;
        }
        for(int i = 1;i <=a;i++) {
            for(int j2 = 1;j2 <=(a+1)-i;j2++) {
                System.out.print(a2 + " ");
                a2 -=1;
            }
            for(int j3 = 1;j3 <=a + 1;j3++) {
                System.out.print(" ");
            }
            a2 = a;
            System.out.print("\n");
        }
    }
}
