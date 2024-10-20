package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal = new Human(22, "Akash Gautam");
        // Human twin = new Human(kunal);

        Human twin = (Human) kunal.clone();

        twin.arr[0] = 100;
        twin.name = "Raj";

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        System.out.println(kunal.age + " " + kunal.name);
        System.out.println(Arrays.toString(kunal.arr));
    }
}
