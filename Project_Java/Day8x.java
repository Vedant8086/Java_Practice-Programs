import java.util.*;
public class Day8x {
    public static void main(String[] args) {
        // ArrayListMethod();
        // pascal_triangle(6);
        DataTypes();
    }
    public static void pascal_triangle(int n) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.get(0).add(1);
        arr.get(1).add(1);
        arr.get(1).add(1);
        for(int i = 2;i < n;i++) {
            ArrayList<Integer> ee = new ArrayList<>();
            ee.add(1);
            for(int j = 0;j < i - 1;j++) {
                int s1 = arr.get(i-1).get(j);
                int s2 = arr.get(i-1).get(j + 1);
                ee.add(s1+s2);
            }
            ee.add(1);
            arr.add(ee);
        }

        System.err.println(arr);
    }
    public static void ArrayListMethod() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);

        
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(arr);
        arr.set(2,80);
        arr.removeLast();
        arr.remove(1);
        System.out.println(arr);
        

    }
    public static void DataTypes() {
        // ArrayList List = new ArrayList();
        // for(int i =1;i <=5;i++) {
        //     List.add(i);
        // }
        // List.add("Strings");
        // List.add("Super");
        // List.add("Apple");

        // for(var i : List) {
        //     System.out.print(i + " ");
        // }
    }
}
