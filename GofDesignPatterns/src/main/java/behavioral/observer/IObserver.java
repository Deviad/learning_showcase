package behavioral.observer;

interface IObserver {
    IObserver update(IObserver observer);
    String getTag();
    IObserver setTag(String tag);
    Runnable getDoSomething();
    void setDoSomething(Runnable runnable);
}