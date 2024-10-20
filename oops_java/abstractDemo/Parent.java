package abstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // we can not create abstract constructor
    static void hello() {
        System.out.println("hey");
    }

    void normal() {
        System.out.println("This is normal method");
    }

    abstract void career();

    abstract void partner();
}
