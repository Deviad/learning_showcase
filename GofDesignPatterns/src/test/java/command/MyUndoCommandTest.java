package command;

import behavioral.command.MyRedoCommand;
import behavioral.command.MyUndoCommand;
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
public class MyUndoCommandTest {
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
    public void myUndoCommandExecutesPerformRedo() {
        doCallRealMethod().when(receiver).performUndo();
        MyUndoCommand redo = new MyUndoCommand(receiver);
        redo.doIt();
        assertEquals("Executing -MyUndoCommand", outContent.toString().trim());
        verify(receiver).performUndo();
    }
}
