class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ft1{
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student();

        // Assign values
        s1.id = 101;
        s1.name = "Atharv";

        // Call method
        s1.display();
    }
}