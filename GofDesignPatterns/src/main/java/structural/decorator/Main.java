package structural.decorator;

public class Main {
    public static void main(String ...main) {
        Car car = new Car();
        SportsCar sporty = new SportsCar(car);
        System.out.println(sporty.turnOn());
    }
}
