package behavioral.command;

public class MyUndoCommand implements ICommand {
    private Receiver receiver;
    MyUndoCommand(Receiver recv)
    {
        receiver=recv;
    }
    @Override
    public void doSomething() {
        receiver.performUndo();
    }
}
