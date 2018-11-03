package behavioral.chainofresponsibility;

import java.util.Scanner;

class CheckAuthority {

    public static void main(String ...args) {
        ManagerPPower manager = new ManagerPPower();
        DirectorPPower director = new DirectorPPower();
        VicePresidentPPower vp = new VicePresidentPPower();
        PresidentPPower president = new PresidentPPower();
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(president);
        Scanner in = new Scanner(System.in);

        // Press Ctrl+C to end.
        try {
            int i = 0;
            while (i<5) {
                i++;
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(in.nextLine());
                manager.processRequest(new PurchaseRequest(d, "General"));
            }

        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
}
