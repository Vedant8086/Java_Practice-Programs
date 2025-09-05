
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day6x {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // int n = sc.nextInt();
            // int[][] arr =new int[n][n];
            // for(int i = 0;i < n;i++) {
            //     for(int j = 0;j < n;j++) {
            //         arr[i][j] = sc.nextInt();
            //     }
            // }
            // System.out.println();
            // Spiral_Printing_Vertical(arr, n);
            // Spiral_Printing_Horizontal(arr, n);
            // Spiral_Printing_Matrix(arr,n);
            // Row_Column_Interchange(arr, n);
            // Rotate_By_90(arr, n);
            //For Clockwise 90 first do transpose and then reverse each row
            //For Anti-Clockwise 90 first reverse and then do transpose.
            String x = sc.nextLine();
            printing_String(x);
            isPalindrome(x);
            
        }
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
    public static List<Integer> spirallyTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> res = new ArrayList<>();

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; ++i) {
                res.add(mat[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom; ++i) {
                res.add(mat[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    res.add(mat[i][left]);
                }
                left++;
            }
        }

        return res;
    }

    public static void Spiral_Printing_Matrix(int[][] arr,int n) {
        List<Integer> ans = spirallyTraverse(arr);
        for(int i : ans) {
            System.out.print(i + " ");
        }
        
    }
    public static void Spiral_Printing_Horizontal(int[][] arr,int n) {
        int i = 0,j = 0;
        int m = n;
        while(i < n) {
            while(j < m && j >= 0) {
                System.out.print(arr[i][j] + " ");
                if(i % 2 == 0) j++;
                else j--;
            }
            if(j < 0) j = 0;
            else j--;
            i++;
        }
    }
    public static void Spiral_Printing_Vertical(int[][] arr,int n) {
        int i = 0,j = 0;
        int m = n;
        while(j < m) {
            while(i < n && i >= 0) {
                System.out.print(arr[i][j] + " ");
                if(j % 2 == 0) i++;
                else i--;
            }
            if(i < 0) i = 0;
            else i--;
            j++;
        }

    }
}
