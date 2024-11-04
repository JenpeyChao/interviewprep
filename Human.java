public class Human {
    // Private attributes, encapsulated within the class
    private String name;
    private int age;
    private double weight;

    // Constructor to initialize attributes
    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getter method for name, allowing controlled access
    public String getName() {
        return name;
    }

    // Setter method for name, allowing controlled modification
    public void setName(String name) {
        this.name = name;
    }

    // Public method, part of the class’s interface
    public void introduce() {
        System.out.println("Hi, my name is " + name + ".");
    }
}

class Student extends Human {
    private String school;

    // Constructor to initialize both Human and Student-specific attributes
    public Student(String name, int age, double weight, String school) {
        super(name, age, weight);  // Calls the constructor of the superclass (Human)
        this.school = school;

    }

    public void displaySchool() {
        System.out.println("I attend " + school + ".");
    }
}

class Main {
    public static void main(String[] args) {
        Human person = new Human("Alice", 30, 70.0);
        Human student = new Student("Bob", 20, 65.0, "University of OOP");

        person.introduce();   // Output: Hi, my name is Alice.
        student.introduce();  // Output: Hi, my name is Bob. I am a student at University of OOP.
    }
}
