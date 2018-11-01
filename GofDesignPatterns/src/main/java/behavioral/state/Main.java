package behavioral.state;



public class Main {
    public static void main(String ...args) {
        Off initialState = new Off();
        TV tv = new TV(initialState);
        tv.pressButton();
        tv.pressButton();
    }
}
