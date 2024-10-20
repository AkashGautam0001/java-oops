package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>();
        List<Integer> linklist = new LinkedList<>();
        arrlist.add(34);
        arrlist.add(45);

        List<Integer> vector = new Vector<>();
        vector.add(34);
        System.out.println(vector);

    }
}
