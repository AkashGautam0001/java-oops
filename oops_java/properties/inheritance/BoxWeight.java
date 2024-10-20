package properties.inheritance;

public class BoxWeight extends Box {
    double weight = -1;

    BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) { // Box box5 = new BoxWeight(2, 3, 4, 4); it is similar like that
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // call the parent class constructor
        this.weight = weight;
        // super(l, h, w); // this does not work
        System.out.println(super.w); // 'super' use as contructor
        // System.out.println(this.weight); // child weight;
        // System.out.println(super.weight); // parent weight
    }

    public BoxWeight(double l, double h, double w) {
        super(l, h, w); // call the parent class constructor
    }

    public BoxWeight(BoxWeight box, double weight) {
        super(box); // call the parent class constructor
        this.weight = weight;
    }

    static void greeting() {
        System.out.println("Hey I am in BoxWeight class, Greetng");
    }
}
