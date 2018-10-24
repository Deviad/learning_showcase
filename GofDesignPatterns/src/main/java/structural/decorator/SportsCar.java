package structural.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    public void turnOn() {
        super.turnOn();

        System.out.println("It goes fast!");
    }

}
