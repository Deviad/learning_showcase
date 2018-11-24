package command;


import behavioral.command.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class InvokeTest {

    @Test
    public void executeCommandCallsDoItOfMyRedoCommand() {
        Invoke invoke = new Invoke();
        Receiver receiver = spy(new Receiver());
        ICommand command  = spy(new MyRedoCommand(receiver));
        invoke.executeCommand(command);
        verify(command).doIt();
    }

    @Test
    public void executeCommandCallsDoItOfMyUndoCommand() {
        Invoke invoke = new Invoke();
        Receiver receiver = spy(new Receiver());
        ICommand uCommand  = spy(new MyUndoCommand(receiver));
        invoke.executeCommand(uCommand);
        verify(uCommand).doIt();
    }
}
