import java.util.Scanner;
public class Product_Except_itself {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];
        int mul = 1;
        for(int i = 0;i < n;i++) {
            left[i] = mul;
            mul *= arr[i];
        }
        mul = 1;
        for(int i = n-1;i>=0;i--) {
            right[i] = mul;
            mul *=arr[i];
        }

        for(int i = 0;i < n;i++) {
            ans[i] = left[i]*right[i];
        }
        for(int i = 0;i < n;i++) {
            System.out.print(ans[i]+" ");
        }
    }
}