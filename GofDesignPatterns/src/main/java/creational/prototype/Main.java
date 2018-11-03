package creational.prototype;

public class Main {
    public static void main(String ...args) throws CloneNotSupportedException {

      BasicCar renault_base = new Renault("Renault");
      renault_base.price = 10000;

      BasicCar mercedes_basic = new Mercedes("Ford");
      mercedes_basic.price = 50000;


      BasicCar bc1;

      bc1 = renault_base.clone();

      bc1.price = renault_base.price +  BasicCar.addToPrice();
      System.out.println("Car is: "+ bc1.modelName+" and it's price is $"+bc1.price);

      bc1.price = mercedes_basic.price + BasicCar.addToPrice();
      System.out.println("Car is: "+ bc1.modelName+" and it's price is $"+bc1.price);

    }
}
