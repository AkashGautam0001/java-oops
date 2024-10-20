package interfaces.extendInterface2;

public interface A {

    default void fun() {
        System.out.println("I am default in A");
    }

    static void greeting() {
        System.out.println("I am in A");
    }
}
