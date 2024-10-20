package interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car0 = new Car();
        // Engine car = new Car();
        // car.acc();
        // car.start();
        // car.stop();

        // Media carMedia = new Car();
        // this is so weired so we create each class for every interface
        // carMedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.upgradeEngine(new ElectricEngine());
        car.start();
    }
}
