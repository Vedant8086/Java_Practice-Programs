import java.io.*;
import java.util.*;
public class String1 {
    public static void main(String args[]) {
        String  s1 = "Sachin";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        String s2 = "  vedant   ";
        System.out.println(s2.trim());
        System.out.println(s2.startsWith("v"));
        System.out.println(s2.length());
        System.out.print(s2.charAt(3));
        String s3 = "java is programming language.";
        String s3e = s3.replace("java", "kava");
        System.out.print(s3e);
        
    }

}
