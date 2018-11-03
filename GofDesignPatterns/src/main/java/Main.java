

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("\n");
        System.out.println("--- Abstract Factory ---");
        creational.abstractFactory.Main.main();
        System.out.println("\n");
        System.out.println("--- Builder ---");
        creational.builder.Main.main();
        System.out.println("\n");
        System.out.println("--- Decorator ---");
        structural.decorator.Main.main();
        System.out.println("\n");
        System.out.println("--- Observer ---");
        behavioral.observer.Main.main();
        System.out.println("\n");
        System.out.println("--- Facade ---");
        structural.facade.Main.main();
        System.out.println("\n");
        System.out.println("--- Singleton ---");
        creational.singleton.Main.main();
        System.out.println("\n");
        System.out.println("--- Proxy ---");
        structural.proxy.Main.main();
        System.out.println("\n");
        System.out.println("--- Composite ---");
        structural.composite.Main.main();
        System.out.println("\n");
        System.out.println("--- Iterator ---");
        behavioral.iterator.Main.main();
        System.out.println("\n");
//        System.out.println("--- Strategy ---");
//        behavioral.strategy.Main.main();
//        System.out.println("\n");
        System.out.println("--- State ---");
        behavioral.state.Main.main();
        System.out.println("\n");
        System.out.println("--- Prototype ---");
        try {
            creational.prototype.Main.main();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("--- Factory ---");
        try {
            creational.factory.Main.main();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
