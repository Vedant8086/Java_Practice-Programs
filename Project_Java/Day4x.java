// import java.lang.*;
import java.util.*;
public class Day4x {
    public static void main(String[] args) {
        // printSwatik();
        Self_X_Collection();
    }
    public static void printSwatik() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    if(((i == 0) && (j < m/2)) || ((j == m -1) && (i < n/2)) || ((i > n/2)&&(j == 0)) || ((i == n -1) && (j > m / 2))) {
                        System.out.print(" * ");
                    } else if(i == n /2 || j == m/ 2) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void Self_X_Collection() {
        @SuppressWarnings("Convert2Diamond")
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0;i < 10;i++) {
            list.add(i);
            list2.add(i);
        }
        
        list.addAll(list2);
        list.addFirst(101);
        list.remove(3);
        if(list.contains(101)) {
            System.out.println("Yes IT is ");
        } else {
            System.out.println("No its not");
        }
        for(int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        List<Integer> vec = new Vector<Integer>();
        for(int i = 0;i < 10;i++) {
            vec.add(i);
        }
        // System.out.println(vec.capacity());
        if(vec.containsAll(list)) {
            System.out.println("Yes List is in it.");
        }
        else System.out.println("No List is in it.");
        for(int i : vec) {
            System.out.print(i + " ");
        }
        System.out.println();
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(10);
        set1.add(10);
        set1.add(90);
        set1.add(87);
        set1.add(56);

        set1.forEach(System.out::println);
        Set<Integer> set2 = new LinkedHashSet<Integer>();
        set2.add(10);
        set2.add(909);
        set2.forEach(System.out::println);
        Set<Integer> set3 = new TreeSet<Integer>();
        set3.add(10);
        set3.add(909);
        set3.forEach(System.out::println);

        @SuppressWarnings("Convert2Diamond")
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(909);
        pq.add(100);
        pq.add(90);
        pq.forEach(System.out::println);

        Map<Integer, String> maps = new HashMap<Integer, String>();
        maps.put(10, "10");
        maps.put(90, "90");
        maps.put(100, "100");
        System.out.println("Getting Value for 10 is " + maps.get(10));
        maps.forEach((k, v) -> System.out.println(k + " : " + v));
        HashMap<Integer, String> maps2 = new HashMap<Integer, String>();
        maps2.put(10, "10");
        maps2.put(90, "90");
        maps2.forEach((k, v) -> System.out.println(k + " : " + v));
    }


}
