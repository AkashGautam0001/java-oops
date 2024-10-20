package singleton;

import access.A;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        // Subclass obj = new Subclass(0, null); // this is possible
        A obj1 = new A(0, null);

        // int n = obj1.num; // / this is not possible
    }
}

class SubSubClassess extends Subclass {
    public SubSubClassess(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        // A obj = new A(0, null);
        SubSubClassess obj = new SubSubClassess(0, null);
        int n = obj.num;
    }
}

class SubSubSubClassess extends Subclass {
    public SubSubSubClassess(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        // A obj = new A(0, null);
        SubSubSubClassess obj = new SubSubSubClassess(0, null);
        int n = obj.num;

        System.out.println(obj instanceof Subclass);

    }
}

class Other {
    private int num;
    String name;

    public Other(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {
        // A obj = new A(0, null);
        SubSubSubClassess obj = new SubSubSubClassess(0, null);
        // int n = obj.num;
    }
}
