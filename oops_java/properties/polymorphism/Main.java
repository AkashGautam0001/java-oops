package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        // Circle circle = new Circle();
        // Square square = new Square();
        Shapes circle = new Circle();
        Shapes square = new Square();
        // reference type = new objectype
        // Parent obj = new Child();
        // hence which method will be called depand on object class is called UPCASTING
        // DYNAMIC METHOD DISPATCH ? How JAVA detemines this ?

        circle.area();
        square.area();
        shape.area();

        /*
         * Types of Polymorphism
         * 1. Compile time / static polymorphism
         * - achieved via method overloading
         * - java does not support operator overloading
         * - same name but types, argument, return types, ordering are different
         * ex. multiple constructor
         * 
         * 
         * 2. Runtime/Dynamic Polymorphism
         * - achieved by method overriding
         */
    }
}
