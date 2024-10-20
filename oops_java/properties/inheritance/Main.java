package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(4, 5, 3);
        // Box box2 = new Box(box);
        // BoxWeight box4 = new BoxWeight();
        // BoxWeight box3 = new BoxWeight(box4, 3);
        // System.out.println(box.l + " " + box.w + " " + box.h);
        // System.out.println(box3.w + " " + box3.weight);

        // Box box = new BoxWeight();
        // Box.greeting(); //give
        // box.greeting();

        // Box box5 = new BoxWeight(2, 3, 4, 4);
        // System.out.println(box5.h);
        // System.out.println(box5.l);
        // System.out.println(box5.w);

        // System.out.println(box5.weight); // ? why it give error ?
        /*
         * BoxWeight box6 = new Box(2, 3, 4);
         * 
         * There are many variables in both parent and child classes
         * you are given access to variables that are in the ref type i.e BoxWeight
         * hence, you should have access to weight variable
         * this also means, that the ones you are trying to access should be initailised
         * but here, when the obj itself is of type parent class,
         * how will you call the constructor of child class
         * 
         * parent did not know child class but, child class know parent class
         * 
         * BoxWeight box6 = new Box(2, 3, 4);
         * System.out.println(box6);
         * 
         */

        BoxPrice boxs1 = new BoxPrice();

        // static method are can be inheritance but not override
        // Override depend on objects, static does not depend on Objects,
        // hence static methods are not overriden

        BoxWeight box = new BoxWeight();
        BoxWeight.greeting(); // You can inherit but you cannot override
    }
}
