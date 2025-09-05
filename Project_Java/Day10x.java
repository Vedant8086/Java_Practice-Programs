// import java.lang.*;
// import java.util.*;
public class Day10x {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Addition of two numbers : "+s1.Adding_Function(10, 13));
        s1.Set_function("Vedant Kulkarni", 21, "PHN");
        s1.get_Function();
        Student s2 = new Student("Rahul Kulkarni",89);
        Student s4 = new Student("Profesion");
        s4.get_Function();
        s2.get_Function();
        Car volks = new Car();
        volks.Vehicle_Function();
        Account acc = new Account();
        acc.SetPassword("Harsh_Coding_Block");
        acc.GetPassword();
    }
}
class Student {
    String name;
    int age;
    String Company_Name;
    Student() {
        System.out.println("Student Class Initialized");
    }
    Student(String a,int n) {
        this.name = a;
        this.age = n;
    }
    Student(String s1) {
        this.Company_Name = s1;
    }
    public int Adding_Function(int a,int b) {
        return a + b;
    }

    public void get_Function() {
        System.out.println("Name of Student : "+this.name);
        System.out.println("Age of Student : "+this.age);
        System.out.println("Works in Company : "+this.Company_Name);
    }
    void Set_function(String name,int age,String Company) {
        this.name = name;
        this.age = age;
        this.Company_Name = Company;
    }
    @SuppressWarnings("unused")
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
        this.Company_Name = s.Company_Name;
    }
}
class Vehicle {
    Vehicle() {
        System.out.println("This is Vehicle Class.");
    }
    void Vehicle_Function() {
        System.out.println("Vehicle Class Called.");
    }
}
class Car extends Vehicle {
    Car() {
        System.out.println("Car is a Vehicle.");
    }

}
class Account {
    private String Password;
    Account() {
        System.out.println("This is Account Password Reset Centre.");
    }

    void SetPassword(String s) {
        this.Password = s;
    }
    void GetPassword() {
        System.out.println("Password : "+this.Password);
    }
}