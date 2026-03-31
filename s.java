class Student {
    // private variables (data hiding)
    private String name;
    private int age;

    // Getter method (to read data)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter method (to modify data)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class S {
    public static void main(String[] args) {
        Student s = new Student();

        // Setting values using setter
        s.setName("Atharv");
        s.setAge(20);

        // Getting values using getter
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}