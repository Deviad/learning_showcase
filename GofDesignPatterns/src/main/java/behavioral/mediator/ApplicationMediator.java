package behavioral.mediator;

import java.util.ArrayList;

class ApplicationMediator implements Mediator {
    private ArrayList<Colleague> colleagues;
    ApplicationMediator() {
        colleagues = new ArrayList<>();
    }
    void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }
    @Override
    public void send(String message, Colleague originator) {
        //let all other screens know that this screen has changed
        for(Colleague colleague: colleagues) {
            //don't tell ourselves
            if(colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}