package generics;

import java.util.*;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        if (index > size)
            return -1;
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
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
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(6);
        for (int i = 0; i < 12; i++)
            list.add(i);
        System.out.println(list.toString());

        // ArrayList<classes> in generics we can only add class not primitive like
        // ArrayList<int> can not be added
        ArrayList<Integer> lis = new ArrayList<>();
        ArrayList list2 = new ArrayList();

    }
}
