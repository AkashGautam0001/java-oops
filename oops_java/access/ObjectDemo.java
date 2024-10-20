package access;

import singleton.Subclass;

public class ObjectDemo {

    int num;

    ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        // return super.hashCode();
        return 34;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo obj2 = new ObjectDemo(34);

        if (obj == obj2) { // checking referance
            System.out.println("Obj1 is less than obj2");
        }

        if (obj.equals(obj2)) { // checking content
            System.out.println("Obj1 is less than obj2");
        }

        System.out.println(obj.hashCode());
        System.out.println(obj.getClass().getName());
    }
}
