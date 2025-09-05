import java.util.Scanner;

public class Day3x {
    public static void main(String[] args) {
        // DecimalToBinary();
        // ArrayToGraph();
        
    }
    public static void ArrayToGraph() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int maxi = Integer.MIN_VALUE;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                if(arr[i] > maxi) {
                    maxi = arr[i];
                }
            }
            for(int i = maxi;i >= 1;i--) {
                for(int j = 0;j < arr.length;j++) {
                    if(maxi - i >= (maxi - arr[j])) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }

                }
                System.out.println();
            }

        }
    }
    public static void DecimalToBinary() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int ans = 0;
            int i = 0;
            while(n!=0) {
                int r = n % 2;
                ans += (r * Math.pow(10,i));
                n /= 2;
                i++; 
            }
            System.out.println(ans);
        }
    }
}
