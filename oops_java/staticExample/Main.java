package staticExample;

public class Main {
    public static void main(String[] args) {

        System.out.println(Human.population);

        Human akash = new Human(20, "Akash Gautam", 200000, false);
        Human rahul1 = new Human(22, "Rahul raj", 0, true);
        Human rahul2 = new Human(22, "Rahul raj", 0, true);
        Human rahul3 = new Human(22, "Rahul raj", 0, true);

        System.out.println(akash.population);
        System.out.println(Human.population);

    }

    static void fun() {
        Main obj = new Main();
        obj.greeting();
    }

    // void fun2(){
    // greeting();
    // }
    void greeting() {
        System.out.println("Hello world");
    }
}
