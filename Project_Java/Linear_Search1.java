import java.util.*;
import java.lang.*;
import java.io.*;
class Linear{
	Linear() {
		System.out.println("Linear Search Started....");
	}
	void Searching() {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the size of array  : ");
		int size = s1.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the array elements : ");
		for(int i = 0;i < size;i++) {
			arr[i] = s1.nextInt();
		}
		System.out.print("Enter the target element : ");
		int target = s1.nextInt();
		for(int i = 0;i < size;i++) {
			if(target == arr[i]) {
				System.out.println(target + " is at position : "+(i+1));
			}
		}
	}
}
public class Linear_Search1 {
	public static void main(String[] args) {
		Linear l1 = new Linear();
		l1.Searching();
	}
	//this is linear search program in java..
}