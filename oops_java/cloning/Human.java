package cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int arr[];

    public Human(int age, String name) {
        this.name = name;
        this.age = age;
        this.arr = new int[] { 2, 3, 4, 5 };
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }

    // This is shallow copy
    // public Object clone() throws CloneNotSupportedException {
    // return super.clone();
    // }

    // This is deep copy
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone();

        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
