package behavioral.command;

public class Invoke
{
    ICommand cmd;
    public void executeCommand(ICommand cmd)
    {
        this.cmd=cmd;
        cmd.doIt();
    }
}
