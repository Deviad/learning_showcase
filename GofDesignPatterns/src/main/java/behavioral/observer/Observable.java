package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

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
