package behavioral.command;

class Receiver
{
    void performUndo()
    {
        System.out.println("Executing -MyUndoCommand");
    }
    void performRedo()
    {
        System.out.println("Executing -MyRedoCommand");
    }
}
