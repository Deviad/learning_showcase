package creational.prototype;

public class Renault extends BasicCar {

    public Renault ( String m ) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
