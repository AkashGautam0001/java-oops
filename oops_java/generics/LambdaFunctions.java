package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        int[] arr = { 34, 5, 34, 2 };

        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(i + 1);
        }

        // arr.forEach((item)-> System.out.println(item * 2));

        Consumer<Integer> fun = (item) -> System.out.println(item * 3);

        // arr.forEach(fun);

        Operation sum = (a, b) -> (a + b);
        Operation prod = (a, b) -> (a * b);
        Operation sub = (a, b) -> (a - b);

        LambdaFunctions fun1 = new LambdaFunctions();
        System.out.println(fun1.operate(3, 5, sub));

    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    // int sum(int a, int b) {
    // return a + b;
    // }
}

interface Operation {
    int operation(int a, int b);
}
