import java.util.*;
import java.lang.*;
public class pract {
    public static void main(String[] args) {
        int [] num = {10,3,5,678,54};
        int n = num.length;
        for(int i =0;i <n-1;i++) {
            int minIndex = i;
            for(int j =i+1;j<n;j++) {
                if(num[minIndex] >j);
                    minIndex = j;
            }
            int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp; 
        }
        for(int i = 0;i < n;i++) {
            System.out.print(num[i] + " ");
        }
    }
}
