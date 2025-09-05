import java.util.*;
public class Day12x {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int f = sc.nextInt();
            print(f);
            zigzag(5);
        }
    }
    public static void print(int n) {
        if(n == 0) return;
        System.out.println("This is Print");
        print(n - 1);
    }
    static int cnt = 1;    
    public static void zigzag(int n) {
        if(n == 0) return;
        System.out.println(n);
        zigzag(n - 1);
        System.out.println(n);
    }
}
