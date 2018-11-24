package behavioral.command;

public class MyUndoCommand implements ICommand {
    private Receiver receiver;
    public  MyUndoCommand(Receiver recv)
    {
        receiver=recv;
    }
    @Override
    public void doIt() {
        receiver.performUndo();
    }
}
