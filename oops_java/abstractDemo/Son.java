package abstractDemo;

public class Son extends Parent {

    int age;

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal(); // this call parent normal() method
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love iron man");
    }
}
