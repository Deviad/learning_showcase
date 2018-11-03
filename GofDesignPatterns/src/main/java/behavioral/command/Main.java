package behavioral.command;

public class Main {
    public static void main(String ...args) {
        Receiver intendedreceiver=new Receiver();
        //Client holds Invoker and Command Objects
        Invoke inv = new Invoke();
        MyUndoCommand unCmd = new MyUndoCommand(intendedreceiver);
        MyRedoCommand reCmd = new MyRedoCommand(intendedreceiver);
        inv.ExecuteCommand(unCmd);
        inv.ExecuteCommand(reCmd);
    }
}
