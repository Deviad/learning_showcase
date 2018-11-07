import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("Hello World!");
        logger.info("\n");
        logger.info("--- Abstract Factory ---");
        creational.abstractFactory.Main.main();
        logger.info("\n");
        logger.info("--- Builder ---");
        creational.builder.Main.main();
        logger.info("\n");
        logger.info("--- Decorator ---");
        structural.decorator.Main.main();
        logger.info("\n");
        logger.info("--- Observer ---");
        behavioral.observer.Main.main();
        logger.info("\n");
        logger.info("--- Facade ---");
        structural.facade.Main.main();
        logger.info("\n");
        logger.info("--- Singleton ---");
        creational.singleton.Main.main();
        logger.info("\n");
        logger.info("--- Proxy ---");
        structural.proxy.Main.main();
        logger.info("\n");
        logger.info("--- Composite ---");
        structural.composite.Main.main();
        logger.info("\n");
        logger.info("--- Iterator ---");
        behavioral.iterator.Main.main();
        logger.info("\n");
        logger.info("--- Strategy ---");
        behavioral.strategy.Main.main();
        logger.info("\n");
        logger.info("--- State ---");
        behavioral.state.Main.main();
        logger.info("\n");
        logger.info("--- Prototype ---");
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
        System.out.println("\n");
        System.out.println("--- Chain of Responsibility ---");
        behavioral.chainofresponsibility.Main.main();

        System.out.println("\n");
        System.out.println("--- Command Pattern ---");
        behavioral.command.Main.main();
        System.out.println("\n");
        System.out.println("--- Flyweight Pattern ---");
        behavioral.flyweight.Main.main();
        System.out.println("\n");
        System.out.println("--- Mediator Pattern ---");
        behavioral.mediator.Main.main();
        System.out.println("\n");
        System.out.println("--- Adapter Pattern ---");
        structural.adapter.Main.main();
        System.exit(0);
    }
}
