package creational.prototype;

public class Mercedes extends BasicCar {

    public Mercedes ( String m ) {
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
