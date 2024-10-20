package abstractDemo;

public class Daughter extends Parent {

    int age;

    public Daughter(int age) {
        // this.age = age;
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("I love iron man");
    }
}
