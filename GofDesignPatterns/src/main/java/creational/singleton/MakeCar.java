package creational.singleton;

public class MakeCar {
    private static MakeCar _car;
    private MakeCar() {

    }
    private static class SingletonHelper {
        private static final MakeCar _car = new MakeCar();
    }
    public static MakeCar getCar() {
        return SingletonHelper._car;
    }
}
