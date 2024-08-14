import java.util.*;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class corejava {
    public static void mymethod() {
        System.out.println("I just writting code in method.");
    }

    public static void main(String[] args) {
        String str = new String("New Test");
        System.out.println(str+" is using string new function.");
        int[] arr = new int[10];
        for(int i = 0;i < 10;i++) {
            arr[i] = i+1;
        }
        System.out.println("Your Entered Array : ");
        for(int i = 0;i < 10;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        String name = "John Sinna";
        boolean state_of_object = true;
        System.out.println("What is State of Object : " + state_of_object);
        System.out.println(name+" is my name.");
        byte var_byte = -90;
        String new_var = null;
        System.out.println("Byte Var : " + var_byte + " And Null String : "+ new_var);
        String firstname = "Vedant";
        String lastname = " Kulkarni";
        System.out.println(firstname.concat(lastname));
        System.out.println(Math.max(9,89));
        System.out.println(Math.min(9,89));
        System.out.println(Math.sqrt(16));
        // String result = ("madam" != "jokalr") ? "Nothing" : "Yes Nothing";
        // System.out.println(result + " : Result");
        int[] nums_list = new int[10];
        for(int i = 0;i < 10;i++) {
            nums_list[i] = i+1;
        }
        System.out.println(nums_list.length+ ": is length of array.");
        int[][] myNumbers = {{1,2,3,4},{5,6,7}};
        System.out.println(myNumbers.length);
        mymethod();
        New_Solution Obj = new New_Solution("Vedant Kulkarni",21);
        System.out.println(Obj.fname + Obj.lname + " have Age : "+Obj.age);
        Scanner scanfs = new Scanner(System.in);
        String Input_String = scanfs.nextLine();
        System.out.println("Input From Scanner class : "+Input_String);
        Obj.Getter_Func();
        outerclass out = new outerclass();
        outerclass.innerclass iner = out.new innerclass();
        System.out.println(out.x + " And The Value : " + iner.y);
        LocalDate times = LocalDate.now();
        LocalTime That_Time = LocalTime.now();
        LocalDateTime Date_Time = LocalDateTime.now();
        DateTimeFormatter Formated_Date_time = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
        String Dates = Date_Time.format(Formated_Date_time);
        System.out.println("Date And Time Of Now : "+ Dates);
        System.out.println("Date And Time Of Now : "+ Date_Time);
        System.out.println("Date And Time Of Now : "+ That_Time);
        System.out.println("Date And Time Of Now : "+ times);
        ArrayList<String> My_arr = new ArrayList<String>();
        My_arr.add("Volvo");
        My_arr.add("BMW");
        My_arr.add("Mercedes-Benz");
        My_arr.add("Ford");
        My_arr.add("Toyota");
        My_arr.add("Hero");
        My_arr.add("Honda");
        System.out.println(My_arr);
        My_arr.remove("Volvo");
        My_arr.remove("Hero");
        My_arr.set(0,"Mazda");
        System.out.println(My_arr);
        System.out.println(My_arr.size());
        System.out.println(My_arr.get(4));
        Iterator<String> it = My_arr.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        ArrayList<Integer> int_arr = new ArrayList<Integer>();
        int_arr.add(21);
        int_arr.add(221);
        int_arr.add(215);
        int_arr.add(216);
        int_arr.add(219);
        int_arr.add(321);
        int_arr.add(421);
        int_arr.sort(null);
        System.out.println(int_arr);
        LinkedList<String> link_arr = new LinkedList<String>();
        link_arr.add("Volvo");
        link_arr.add("BMW");
        link_arr.add("Mercedes-Benz");
        link_arr.add("Ford");
        link_arr.add("Toyota");
        link_arr.add("Hero");
        link_arr.add("Honda");
        System.out.println(link_arr);
        link_arr.addFirst("Mazda");
        link_arr.addLast("Mazda");
        System.out.println(link_arr);
        link_arr.removeFirst();
        link_arr.removeLast();
        System.out.println(link_arr);
        
        System.out.println("First Element In List : "+link_arr.getFirst()+ " And Last Element : "+link_arr.getLast());
        link_arr.sort(null);
        System.out.println(link_arr);
        HashMap<String,String> hashs = new HashMap<String,String>();
        hashs.put("Input_String", "Values1");
        hashs.put("Input_String2", "Values2");
        hashs.put("Input_String3", "Values3");
        hashs.put("Input_String4", "Values45");
        hashs.put("Input_String5", "Values5");
        hashs.put("Input_String6", "Values6");
        for(String i : hashs.keySet()) {
            System.out.println("Key : "+i+" Value : "+hashs.get(i));
        }
    }
}
class New_Solution {
    String names;
    int ages;
    New_Solution(String name,int age) {
        System.out.println("I am Constructor of The Class.");
        this.ages = age;
        this.names = name;
    }
    void Getter_Func() {
        System.out.println("The Name you Entered is : "+this.names + " And Age : "+this.age);
    }
    public String fname = "Vedant ";
    public String lname = "Kulkarni";
    public int age = 90;
}   


class outerclass {
    int x = 50;


    class innerclass {
        int y = 90;
    }


}
