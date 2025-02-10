import java.util.Scanner;
public class String_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String ans = "";
        char c = s.charAt(0);
        for(int i = 1;i < s.length();i++) {
            if(s.charAt(i) != c) {
                ans += c;
                c = s.charAt(i);
                i--;
            }
        }
        ans += c;
        System.out.println(ans);
    }
}
