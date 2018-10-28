package structural.decorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    public String turnOn() {
        return super.turnOn() + "It goes fast!";
    }

}
