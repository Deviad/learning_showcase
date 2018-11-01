import composite.CompositeTest;
import decorator.DecoratorTest;
import decorator.SportsCarTest;
import iterator.IteratorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import singleton.SingletonTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DecoratorTest.class,
        SportsCarTest.class,
        IteratorTest.class,
        SingletonTest.class,
        CompositeTest.class
})
public class MainTest {

}
