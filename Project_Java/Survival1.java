import java.io.*;
import java.util.*;

public class Survival1 {
    public static void main(String[] args) {
        System.out.println("This is the java program...!!");
		Scanner s1 = new Scanner(System.in);
        int j;
		for(int i=0;i<5;i++)
		{
			j=1;
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}	
			System.out.println();
		}
		int months = 7;
		switch (months) {
			case 1:
				System.out.println("This is January motherfucker!!");
				break;
			case 7 : 
				System.out.println("This is july my Boys!!!");
				break;
			default:
				System.out.println("Java is motherfucking language....");
				break;
		}
		//Declaring New array in town....
		int[] arr = new int[3];
		arr[0] = 10;arr[1] = 20;arr[2] = 30;
		for (int i : arr) {
			System.out.println(i);
		}
		List<Integer> arraylist1 = new ArrayList<>(5);
		for(int i =1 ;i <= 5;i++) {
			arraylist1.add(i);
		}
		System.out.println(arraylist1);

		arraylist1.remove(3);

		for(int i = 0;i < arraylist1.size();i++) {
			System.out.println(arraylist1.get(i) + " ");
		}

		LinkedList<String> TheLink = new LinkedList<>();
		LinkedList<String> TheLink2 = new LinkedList<>();
		TheLink.add("Vedant");
		TheLink.add("Steve");
		TheLink.add("Bill");
		TheLink.add("Elon");
		TheLink.add("Larry");
		TheLink.addFirst("The King");
		TheLink.addLast("The Chariot");
		TheLink.clone();
		TheLink.remove("The Chariot");
		TheLink.removeFirst();
		System.out.println(TheLink);

		HashSet<String> TheSet = new HashSet<>();

		TheSet.add("This");
		TheSet.add("want");
		TheSet.add("to be");
		TheSet.add("Done");
		System.out.println(TheSet);
		System.out.println("This Conatains in HastSet or not : " + TheSet.contains("This"));
		//this is contains return true if it exists.
		
		TreeSet<Integer> TheTree = new TreeSet<>();

		TheTree.add(60);
		TheTree.add(50);
		TheTree.add(40);
		TheTree.add(30);

		System.out.println(TheTree);
		TheTree.remove(30);
		System.out.println(TheTree);
		System.out.println("What is easy DSA or JAVA IN DSA ? : (Y/n)");
		String s = s1.nextLine();
		System.out.println("Is it true that your Reply is : " + s);

    }
}
