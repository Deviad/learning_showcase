package behavioral.flyweight;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String... args) {
        RobotFactory myfactory = new RobotFactory();

        IRobot shape = myfactory.GetRobotFromFactory("small");
        shape.Print();

        /*
            Showing off the new functional approach vs the old imperative one.
         */

        Stream<Optional<IRobot>> robots;
        robots = Stream.generate(
                () ->  Optional.ofNullable(myfactory.GetRobotFromFactory("small"))
        ).limit(10);
        robots.forEach(s->
            s.ifPresent(IRobot::Print));

        int NumOfDistinctRobots = myfactory.TotalObjectsCreated();
        System.out.println("\nDistinct Robot objects created till now= " + NumOfDistinctRobots);

        for (int i = 0; i < 5; i++) {
            shape = myfactory.GetRobotFromFactory("large");
            shape.Print();
        }

        NumOfDistinctRobots = myfactory.TotalObjectsCreated();
        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);
    }
}
