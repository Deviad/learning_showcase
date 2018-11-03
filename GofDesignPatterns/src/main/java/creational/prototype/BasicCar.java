package creational.prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    String modelName;
    int price;

    public String getModelName() {
        return modelName;
    }

    public BasicCar setModelname(String modelName) {
        this.modelName = modelName;
        return this;
    }

    static int addToPrice() {
       int price = 0;
       Random r = new Random();
       int p = r.nextInt(10000);
       price = p;
       return price;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar)super.clone();
    }
}

