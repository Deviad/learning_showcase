package behavioral.state;

public class Off implements RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am Off. I am turning On");
        context.setState(new On());
    }
}
