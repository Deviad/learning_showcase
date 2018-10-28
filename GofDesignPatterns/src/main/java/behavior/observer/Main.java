package behavior.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

interface IObserver {
    IObserver update(IObserver observer);
    String getTag();
    IObserver setTag(String tag);
    Runnable getDoSomething();
    void setDoSomething(Runnable runnable);
}


interface IObservable {
    void fire(IObserver observer);
    void fireAll();
    void subscribe(IObserver observer);
    void unsubscribe(IObserver observer);

}

class Observable implements IObservable {

    List<IObserver> observers = new ArrayList<>();

    @Override
    public void fire(IObserver observer) {
        IObserver subscribedObserver = observers.stream().filter(o->o.equals(observer)).findFirst().orElseThrow(Error::new);
        System.out.println("*** fire *** ");
        subscribedObserver.update(observer).getDoSomething().run();
    }

    @Override
    public void fireAll() {
        for (IObserver observer: observers) {
            System.out.println("*** fire All ***");
            observer.update(observer).getDoSomething().run();
        }
    }

    @Override
    public void subscribe(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void unsubscribe(IObserver observer) {
       observers.remove(observer);
       System.out.println("Observer unsubscribed");
    }
}

class Observer implements  IObserver {

    String tag;
    Runnable doSomething;
    @Override
    public IObserver update(IObserver observer) {
        this.tag = observer.getTag();
        this.doSomething = observer.getDoSomething();
        return observer;
    }

    @Override
    public String getTag() {
        return this.tag;
    }

    @Override
    public Observer setTag(String tag) {
        this.tag = tag;
        return this;
    }


    @Override
    public Runnable getDoSomething() {
        return this.doSomething;
    }

    @Override
    public void setDoSomething(Runnable runnable) {
        this.doSomething = runnable;
    }
}

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
