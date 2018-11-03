package creational.factory;

import java.util.Arrays;

public class Main {
    enum Animals {
        Duck, Lion
    }


    public static void main(String ...args) throws Exception {
        String a = "Duck";
        if (Arrays.stream(Animals.values()).anyMatch(x -> x.name().equals(a))) {
            AnimalFactory factory = new AnimalFactory();
            IAnimal duck = factory.getAnimalType(Class.forName("creational.factory." + a));
            duck.speak();
        } else {
            throw new Exception("Class Not Found");
        }
    }
}
