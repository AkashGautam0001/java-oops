package generics;

import java.util.*;

public class GenericsCustomArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericsCustomArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) (data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" +
                Arrays.toString(data) +
                ", size=" + size + "}";
    }

    public static void main(String[] args) {
        // GenericsCustomArrayList list = new GenericsCustomArrayList();
        // list.add(3);
        // list.add(6);
        // for (int i = 0; i < 12; i++)
        // list.add(i);
        // System.out.println(list.toString());

        // // ArrayList<classes>
        // ArrayList<Integer> lis = new ArrayList<>();
        // ArrayList list2 = new ArrayList();

        GenericsCustomArrayList<Integer> list = new GenericsCustomArrayList<>();
        list.add(34);

        GenericsCustomArrayList<String> list2 = new GenericsCustomArrayList<>();
        System.out.println(list.toString());

    }
}
