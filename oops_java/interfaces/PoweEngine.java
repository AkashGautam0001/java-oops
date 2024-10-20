package interfaces;

public class PoweEngine implements Engine {
    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void acc() {
        System.out.println("Power engine acc");
    }
}
