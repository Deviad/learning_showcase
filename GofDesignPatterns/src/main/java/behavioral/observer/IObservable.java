package behavioral.observer;

interface IObservable {
    void fire(IObserver observer);
    void fireAll();
    void subscribe(IObserver observer);
    void unsubscribe(IObserver observer);

}
