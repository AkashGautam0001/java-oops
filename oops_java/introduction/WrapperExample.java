public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 20;
        Integer a = 10;
        Integer b = 20;
        // Integer num = new Integer(4);
        Integer n = 45;

        swap(a, b);
        System.out.println(a + " " + b);
        // if you pass primitive data type - it is pass by value;
        // but you pass Objects so, it is pass by referance

        // final int a; // give error
        final int bonus = 2; // val can not changed, have to be initialized
        final int INCREASE = 1; // Convention
        // but in objects - ??? learn more
        // garbage collector or finalize ??

        A kunal = new A("Akash Gautam");
        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
        // kunal = new A("new object"); //not possible

        A obj = new A("Vikas");

        // A obj;
        // for (int i = 0; i < 1000000000; i++) {
        // obj = new A("Random Name");
        // }

    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

}

/**
 * A
 */
class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
