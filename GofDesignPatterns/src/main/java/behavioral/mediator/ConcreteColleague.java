package behavioral.mediator;

public class ConcreteColleague extends Colleague {
    ConcreteColleague(Mediator m) {
        super(m);
    }

    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}
