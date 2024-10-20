package generics.comparing;

import java.util.Comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 34);
        Student rahul = new Student(34, 34);
        Student arpit = new Student(34, 87);
        Student karan = new Student(34, 85);
        Student sachin = new Student(34, 54);

        Student[] list = { kunal, rahul, arpit, karan, sachin };

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks - o2.marks);
            }
        });

        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks));

        if (kunal.compareTo(rahul) > 0) {
            System.out.println("Rahul has more marks");
        }
    }
}
