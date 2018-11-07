package behavioral.flyweight;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String... args) {
        RobotFactory myfactory = new RobotFactory();

        IRobot shape = myfactory.getRobotFromFactory("small");
        shape.print();

        /*
            Showing off the new functional approach vs the old imperative one.
         */

        Stream<Optional<IRobot>> robots;
        robots = Stream.generate(
                () ->  Optional.ofNullable(myfactory.getRobotFromFactory("small"))
        ).limit(10);
        robots.forEach(s->
            s.ifPresent(IRobot::print));

        int NumOfDistinctRobots = myfactory.totalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now= " + NumOfDistinctRobots);

        for (int i = 0; i < 5; i++) {
            shape = myfactory.getRobotFromFactory("large");
            shape.print();
        }

        NumOfDistinctRobots = myfactory.totalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);
    }
}
