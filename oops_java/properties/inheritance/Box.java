package properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
    // double weight; // it is access in child class using super.weight

    static void greeting() {
        System.out.println("Hey I am in Box class, Greetng");
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box(double side) {
        super(); // object class
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
