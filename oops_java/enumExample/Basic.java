package enumExample;

public class Basic {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday, Sunday;

        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is Week

        Week() {
            System.out.println("Constructor called for " + this);
        }

        // this is not public or protected, only private or default
        // why ? we dont want to create new objects
        // this is not the enum concept, thats only

        // internally : public static final Week monday = new Week();

        void display() {
        }

        @Override
        public void hello() {
            System.out.println("Hey, How are you ?");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

        week.hello();

        System.out.println(Week.valueOf("Monday"));
        // for (Week day : Week.values()) {
        // System.out.println(day);
        // }

        System.out.println(week.ordinal());
    }
}
