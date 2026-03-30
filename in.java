// Parent class
class Animal {
    void sleep() {
        System.out.println("Animals is sleeping");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// in class
public class in {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sleep();   // inherited method
        d.bark();  // own method
    }
}