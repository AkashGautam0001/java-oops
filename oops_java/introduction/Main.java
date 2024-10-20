import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Student ram;
        Student[] students = new Student[4];
        System.out.println(Arrays.toString(students));
        Student st1 = new Student(); // dynamically allocate memory in heap and return a pointer
        // Student kunal;
        // kunal = new Student();
        TODO: // check output
        System.out.println(st1.marks);
        System.out.println(st1.name);
        st1.marks = 99;
        st1.name = "Akash Gautam";
        // st1.salary = 23000;

        Student random = new Student(st1);
        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
    }

}

// class is logical contruct, rules
// object is physical reality

class Student {
    int rno;
    String name;
    float marks;

    // why underneth thing are not correct ?
    // Student(){
    // std1.rno = 12;
    // std1.name = "Kunam Kushwaha";
    // std1.marks = 55.4f;
    // }

    // kunal, akash -> for generalisation 'this' is used
    // Objects store in heap memory
    // What we dont use 'new' keyword for creating primitive data types ?
    // understand heap and stack memory
    // where primitive or object are stored and why ?
    // Memory allocation of 'new' keyword

    Student() {
        this.rno = 12;
        this.name = "Kunam Kushwaha";
        this.marks = 55.4f;
    }

    // why its not working
    // this is how you call a constructor from another constructor
    // internally: new Student (14, "default person", 100.0f);

    // Student(){
    // this(14, "AKash", 34.5);
    // }

    Student(int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    void greeting() {
        System.out.println("My name is " + name);
        System.out.println("My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }

}