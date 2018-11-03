package behavioral.chainofresponsibility;

import java.util.Scanner;

class CheckAuthority {

    public static void main(String[] args) {
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);
        // Press Ctrl+C to end.
        try {
            int i = 0;
            while (i<5) {
                i++;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(input.nextLine());
                manager.processRequest(new PurchaseRequest(d, "General"));
            }
        }
        catch (Exception exc) {
            System.exit(1);
        }
    }
}
