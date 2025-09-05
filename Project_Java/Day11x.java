
public class Day11x {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.SetInfoName("Rakesh_Yadav", "Pappu_Yadav", "Bitti_Yadav");
        // s1.SetAge(19);        
        // s1.SetMarks(91);
        // System.out.println("Student Name  : "+s1.GetName());
        // System.out.println("Student's Father Name  : "+s1.GetFatherName());
        // System.out.println("Student's Mother Name  : "+s1.GetMotherName());
        // System.out.println("Student's Age  : "+s1.GetAge());
        // System.out.println("Student's Marks  : "+s1.GetMarks());
        Animal MyAnimal = new Animal();
        MyAnimal.Sound();
        Cat cat1 = new Cat();
        cat1.Sound();
        cat1.AnimalSound();
    }    
}

class Student {
    String name;
    String Father_name;
    String Mother_Name;
    int Age;
    int percentage;
    Student() {
        System.out.println("Student Marking and Detailing Class Initialized.");
    }

    public void SetInfoName(String name,String Father,String Mother) {
        this.name = name;
        this.Father_name = Father;
        this.Mother_Name = Mother;
    }

    void SetAge(int age) {
        this.Age = age;
    }
    void SetMarks(int Marks) {
        this.percentage = Marks;
    }

    String GetName() {
        return this.name;
    }
    String GetFatherName() {
        return this.Father_name;
    }
    String GetMotherName() {
        return this.Mother_Name;
    }

    int GetAge() {
        return this.Age;
    }
    int GetMarks() {
        return this.percentage;
    }
}
class Animal {
    Animal() {
        System.out.println("This is Animal Class");
    }

    void Sound() {
        System.out.println("Every Animal Has Different Sound.");
    }
}

class Cat extends Animal {
    Cat() {
        System.out.println("This is Cat Class.");
    }
    void Sound() {
        System.out.println("Cat Sound is Meow.");
    }
    void AnimalSound() {
        super.Sound();
    }
}