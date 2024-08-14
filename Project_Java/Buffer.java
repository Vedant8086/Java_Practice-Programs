import java.io.*;
import java.util.*;
public class Buffer {
    public static void main(String args[]) {
        StringBuffer s1 = new StringBuffer("SitPoly");
        int p = s1.length();
        int q = s1.capacity();
        System.out.println("length of string is : " + p);
        System.out.println("capacity of string is : " + q);
        StringBuffer s2 = new StringBuffer("sit");
        s2.append(" Degree");
        System.out.println(s2);
        System.out.println(s2.reverse());
        StringBuffer s3 = new StringBuffer("Smith John");
        s3.insert(s3.length()-1," Donomi");
        System.out.println(s3);
        System.out.println(s3.deleteCharAt(5));
        char a1_arr[] = {'A','B','C'};
        s3.insert(s3.length()-1,a1_arr);
        System.out.println(s3);
        System.out.println("This is new typing expirience on rog keyboard.");
        StringBuffer s8 = new StringBuffer();
        

    }
}
