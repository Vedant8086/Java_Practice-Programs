import java.lang.*;
import java.util.*;
public class Day20x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < 10;i++)  {
            st.push(i);
        }
        int nt = sc.nextInt();
        st.push(nt);
        System.out.println(st.peek());
        Stack<Integer> sc1 = new Stack<>();
        sc1 = st;
        int x = sc1.size();
        for(int i = 0;i < x;i++) {
            System.out.println(sc1.peek());
            sc1.pop();
        }
        
        sc.close();
    }
}
