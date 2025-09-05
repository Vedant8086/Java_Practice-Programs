import java.util.*;
public class Day7x {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Row_Column_Interchange(arr, n);
            // Rotate_By_90(arr, n);
            //For Clockwise 90 first do transpose and then reverse each row
            //For Anti-Clockwise 90 first reverse and then do transpose.
            // String x = sc.nextLine();
            // printing_String(x);
            // isPalindrome(x);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < n;j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter a number to find in it : ");
            int k = sc.nextInt();
            // finding_number_in_2D(arr, n, k);
            // System.out.println("Enter the String for Compression : ");
            // String c = sc.next();
            // String_Compression(c);
            Shell_Rotation_By_90(arr,n,2);
        }
    }
    public static void Shell_Rotation_By_90(int[][] arr,int n,int k) {
        k--;
        int x = (n - 1 - k) - k;
        int[] arr_x = new int[x*x];
        int g = 0;
        for(int i = k;i <=n - 1 - k;i++) {
            for(int j = k;j < n - 1 - k;j++) {
                arr_x[g] = arr[i][j];
                g++;
            }
        }

        System.out.println("Entered Array : ");
        for(int i = 0;i < x*x;i++) {
            System.out.print(arr_x[i] + " ");
        }
    }
    public static void String_Compression(String x) {
        int n = x.length();
        String a = "";
        int count = 1;
        Character b = x.charAt(0);
        for(int i = 1;i< n;i++) {
            if(x.charAt(i) == b) {
                count++;
            } else {
                a += b;
                a += Integer.toString(count);
                count = 1;
                b = x.charAt(i);
            }
        }
        a+=b;
        a += Integer.toString(count);
        System.out.println("Compressed String : "+ a);

    }
    public static void finding_number_in_2D(int[][] arr,int n,int k) {
        // Boolean isFind = false;
        for(int i = 0;i < n;i++) {
            if(arr[i][0] <= k && arr[i][n - 1] >=  k) {
                for(int j = 0;j < n;j++) {
                    if(arr[i][j] == k) {
                        System.out.println(k+" is at index "+ i + " -> " + j);
                        return;
                    }
                }
            } 
        }
        System.out.println("Can't Find the number in it.");
    }
    public static void isPalindrome(String a) {
        int n = a.length();
        for(int i = 0;i <= n / 2;i++) {
            if(a.charAt(i) != a.charAt(n - 1 - i)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.err.println("Palindrome");

    }
    public static void printing_String(String a) {
        int n = a.length();
        for(int i = 0;i < n;i++){
            String em = "";
            for(int j = i;j < n;j++) {
                em += a.charAt(j);
                System.out.println(em);
            }

            System.out.println();
        }
    }
    public static void Rotate_By_90(int[][] arr,int n) {
        Row_Column_Interchange(arr, n);
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n / 2;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
        Print_Array(arr, n);
    }
    public static void Print_Array(int[][] arr,int n) {
        System.out.println("Array After Shifting : ");
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Row_Column_Interchange(int[][] arr,int n) {
        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j < n;j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        System.out.println("Array After Shifting : ");
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
