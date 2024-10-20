package interfaces.extendInterface2;

public class Main implements A, B {
    @Override
    public void greet() {

    }

    // Cannot reduce the visibility of the inherited method from B
    // @Override
    // private void greet() {

    // }

    // Duplicate default methods named fun with the parameters () and () are
    // inherited from the types B and A --> fun() in both interface

    // @Override
    // public void fun() {

    // }

    public static void main(String[] args) {
        // Main obj = new Main();
        A.greeting();

    }
}
