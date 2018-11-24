package behavioral.observer;

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