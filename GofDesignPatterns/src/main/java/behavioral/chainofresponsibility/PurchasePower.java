package behavioral.chainofresponsibility;

abstract class PurchasePower {
    static final double BASE = 500;
    private PurchasePower successor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    void setSuccessor(PurchasePower successor) {
        this.successor = successor;
    }

    void processRequest(PurchaseRequest request) {
        if (request.getAmount() < this.getAllowable()) {
            System.out.println(this.getRole() + " will approve $" + request.getAmount());
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
