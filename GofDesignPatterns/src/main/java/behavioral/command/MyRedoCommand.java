package behavioral.command;

public class MyRedoCommand implements ICommand
{
    private Receiver receiver;
    public MyRedoCommand(Receiver recv)
    {
        receiver=recv;
    }
    @Override
    public void doIt()
    {
        //Call redo in receiver
        receiver.performRedo();
    }
}