package behavioral.mediator;


interface Mediator {
  void send(String message, Colleague colleague);
}