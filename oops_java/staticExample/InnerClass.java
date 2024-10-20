package staticExample;

class Test2 {
    static String name;

    public Test2(String name) {
        Test2.name = name;
    }
}

// outer class can not be static
public class InnerClass {

    // inner class can be static
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a.name);

        Test2 c = new Test2("Akash");
        Test2 d = new Test2("Vikas");

        // System.out.println(c.name);
        // System.out.println(d.name);

    }
}

// static class A {

// }
