package structural.decorator;

public class Main {
    public static void main(String ...main) {
        structural.decorator.Car car = new Car();
        SportsCar sporty = new SportsCar(car);
        sporty.turnOn();
    }
}
