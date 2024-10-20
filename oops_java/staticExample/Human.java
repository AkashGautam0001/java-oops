package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message() {
        System.out.println("Hello world");
        // System.out.println(this.age); cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // this.population += 1; wrong way to access it, it is member of class not a
        // particular objects
        Human.population += 1;
        // Human.message();
    }

}
