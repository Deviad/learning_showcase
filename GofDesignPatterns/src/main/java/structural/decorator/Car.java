package structural.decorator;

public class Car {
    String _name;
    Integer age;

    public Car setName(String name) {
        return this;
    }

    public void turnOn() {
        System.out.print("Vroom, ");
    }
 }
