package behavioral.strategy;

import behavioral.strategy.choices.FirstChoice;
import behavioral.strategy.choices.IChoice;
import behavioral.strategy.choices.SecondChoice;
import behavioral.strategy.context.Context;

import java.util.Scanner;

class InvalidChoice extends Exception {
    InvalidChoice() {
        super("An invalid choice was made");
    }
}


public class Main {

    private static void commandPrompt(final Scanner in, final Context ctx) throws InvalidChoice {
        IChoice ic;
        String input1, input2;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter an integer");
            input1 = in.nextLine();
            System.out.println("Enter another integer");
            input2 = in.nextLine();
            System.out.println("Press 1 for addition, 2 for concatenation");
            String c = in.nextLine();
            switch (c) {
                case "1":
                    ic = new FirstChoice();
                    break;
                case "2":
                    ic = new SecondChoice();
                    break;
                default:
                    throw new InvalidChoice();
            }
            ctx.setChoice(ic);
            ctx.showChoice(input1, input2);
        }
    }

    public static void main(String ...args) {
        Scanner in = new Scanner(System.in);
        Context ctx = new Context();
        Runnable r = ()-> {
            try {
                commandPrompt(in, ctx);
            } catch (InvalidChoice invalidChoice) {
                invalidChoice.printStackTrace();
            }
        };

        r.run();
    }
}
