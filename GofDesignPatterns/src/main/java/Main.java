

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
        behavior.observer.Main.main();
    }
}
