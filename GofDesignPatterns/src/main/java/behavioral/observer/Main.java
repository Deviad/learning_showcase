package behavioral.observer;

public class Main {
    public static void main(String ...args) {
    IObserver observer1 = new Observer();
    observer1.setTag("Ciccio").setDoSomething(()-> System.out.println(observer1.getTag()));
    IObservable observable1 = new Observable();
    observable1.subscribe(observer1);
    observable1.fire(observer1);
    observable1.fire(observer1.setTag("Azzzz"));
    observable1.fireAll();
    observable1.unsubscribe(observer1);
    }
}
