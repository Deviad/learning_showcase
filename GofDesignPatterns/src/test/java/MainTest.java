import behavioral.command.MyUndoCommand;
import command.InvokeTest;
import command.MyRedoCommandTest;
import command.MyUndoCommandTest;
import composite.CompositeTest;
import decorator.DecoratorTest;
import decorator.SportsCarTest;
import iterator.IteratorTest;
import state.StateTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import singleton.SingletonTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        DecoratorTest.class,
        SportsCarTest.class,
        IteratorTest.class,
        SingletonTest.class,
        CompositeTest.class,
        StateTest.class,
        InvokeTest.class,
        MyRedoCommandTest.class,
        MyUndoCommandTest.class
})
public class MainTest {

}
