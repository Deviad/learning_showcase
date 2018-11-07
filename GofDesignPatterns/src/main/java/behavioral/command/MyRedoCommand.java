package behavioral.command;

class MyRedoCommand implements ICommand
{
    private Receiver receiver;
    MyRedoCommand(Receiver recv)
    {
        receiver=recv;
    }
    @Override
    public void doSomething()
    {
        //Call redo in receiver
        receiver.performRedo();
    }
}