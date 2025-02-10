import java.util.Scanner;
public class Count_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        int[] arr = new int[26];
        for(int i = 0;i < s.length();i++) {
            arr[(int)(s.charAt(i))-97]++;
        }
        for(int i = 0;i < 26;i++) {
            if(arr[i] != 0) System.out.println((char)('a'+i)+" : "+arr[i]);
        }
    }
}
