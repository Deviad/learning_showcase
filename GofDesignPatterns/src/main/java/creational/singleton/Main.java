package creational.singleton;

public class Main {
    public static void main(String ...args) {
        System.out.println("Trying to make a car for our team");
        MakeCar mc = MakeCar.getCar();
        System.out.println("Trying to make another car for our team");
        MakeCar mc2 = MakeCar.getCar();
        if (mc == mc2)
        {
            System.out.println("c1 and c2 are same instance");
        }
    }

}
