import decorator.DecoratorTest;
import decorator.SportsCarTest;
import iterator.IteratorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DecoratorTest.class,
        SportsCarTest.class,
        IteratorTest.class
})
public class MainTest {

}
