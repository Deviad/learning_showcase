package behavioral.mediator;


abstract class Colleague {
    private Mediator mediator;


    Colleague(Mediator m) {
        mediator = m;
    }

    //send a message via the mediator
    void send(String message) {
        mediator.send(message, this);
    }

    //get access to the mediator
    Mediator getMediator() {
        return mediator;
    }

    abstract void receive(String message);
}

