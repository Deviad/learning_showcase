package command;

import behavioral.command.MyRedoCommand;
import behavioral.command.Receiver;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doCallRealMethod;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class MyRedoCommandTest {

    @Mock
    Receiver receiver;
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }


    @Test
    public void myRedoCommandExecutesPerformRedo() {
        doCallRealMethod().when(receiver).performRedo();
        MyRedoCommand redo = new MyRedoCommand(receiver);
        redo.doIt();
        assertEquals("Executing -MyRedoCommand", outContent.toString().trim());
        verify(receiver).performRedo();
    }
}
