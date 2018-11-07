package behavioral.command;

class Invoke
{
    ICommand cmd;
    public void ExecuteCommand(ICommand cmd)
    {
        this.cmd=cmd;
        cmd.doSomething();
    }
}
