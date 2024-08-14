import java.io.*;
import java.util.*;
public class Animal {
    void eat() {
        System.out.println("Eating....");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking.....");
    }
}
class TestingAnimal {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}