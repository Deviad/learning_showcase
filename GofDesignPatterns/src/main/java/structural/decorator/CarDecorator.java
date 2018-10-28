package structural.decorator;

public class CarDecorator {

    private Car car;


    public CarDecorator(Car car) {
        this.car = car;
    }

    public String turnOn() {
       return  car.turnOn();
    }

}
