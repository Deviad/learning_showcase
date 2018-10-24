package creational.builder;


class Car {
    private String make;
    private String model;
    private int numDoors;
    private String colour;

    public Car(String make, String model, String colour, int numDoors) {
        this.make = make;
        this.model = model;
        this.numDoors = numDoors;
        this.colour = colour;
    }

    public Car() {

    }

    @Override
    public String toString() {
        return "Car[ " + "Make: " + make + ", Model: " +  model + ", N. Doors: " + numDoors + ", Colour: " + colour  +  " ]";
    }

    public String getMake() {
        return make;
    }

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public Car setNumDoors(int numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    public String getColour() {
        return colour;
    }

    public Car setColour(String colour) {
        this.colour = colour;
        return this;
    }
}

interface ICarBuillder {
    Car getCar();

}

class FerrariBuilder implements ICarBuillder {

    private String colour;
    private int doors;
    private Car car;



    @Override
    public Car getCar() {
        this.car = new Car();
        this.car.setMake("Ferrari").setModel("Enzo");
        return doors == 2 ? this.car.setNumDoors(this.doors).setColour(this.colour) : null;
    }

    public String getColour() {
        return colour;
    }

    public FerrariBuilder setColour(String colour) {
        this.colour = colour;
        return this;
    }

    public int getDoors() {
        return doors;
    }

    public FerrariBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }
}

class SportCarsBuildDirector {
    private ICarBuillder builder;

    public SportCarsBuildDirector(ICarBuillder builder) {
        this.builder = builder;
    }

    public Car init() {
       return this.builder.getCar().setColour("red").setNumDoors(2);
    }
}


class Client {

    public Car init() {
        FerrariBuilder builder = new FerrariBuilder();
        builder.setColour("red").setDoors(2);
        SportCarsBuildDirector director = new SportCarsBuildDirector(builder);
        return director.init();

    }
}

public class Main {
    public static void main(String... args) {
    Client client = new Client();
    System.out.print(client.init());
    }
}
