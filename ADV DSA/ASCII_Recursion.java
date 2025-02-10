
import java.util.Scanner;

public class ASCII_Recursion {
    public static void  ASCII(String s,int i,String x) {
        if(i == x.length()) {
            System.out.println(s);
            return;
        }
        ASCII(s+x.charAt(i),i+1,x);
        ASCII(s,i+1,x);
        ASCII(s+(int)x.charAt(i),i+1,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String x = sc.nextLine();
        ASCII("",0,x);
        sc.close();
    }
}
