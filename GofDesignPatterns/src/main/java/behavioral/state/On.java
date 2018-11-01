package behavioral.state;

public class On implements RemoteControl {
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am On. I am turning Off");
        context.setState(new Off());
    }
}
