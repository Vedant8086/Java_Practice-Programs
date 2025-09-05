import java.lang.*;
import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if(n % 3 == 0) {
            System.out.println("Fizz");
        }else if(n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n + "!");
        }

        System.out.println(8 / 5);
        // 1 + 3 * 3 / 5;

        int x = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        for(int i = 2;i <= x;i++) {
            boolean flag = true;
            for(int v : list) {
                if(i % v == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                list.add(i);
            }
        }


        for(int v : list) {
            System.out.println(v);
        }
    }
}
