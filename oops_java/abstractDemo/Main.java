package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(0);
        son.career();

        Daughter daughter = new Daughter(23);
        daughter.career();
        daughter.normal();

        // Parent mom = new Parent(34); we have contructor in abstract class but we can
        // not create object

        Parent.hello();

        Parent daughter2 = new Daughter(23);

    }
}
