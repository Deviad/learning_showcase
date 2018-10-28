package behavioral.strategy.choices;

public class SecondChoice implements IChoice {

    @Override
    public void getChoice(String s1, String s2) {
        System.out.println("Concatenate the numbers.");
        System.out.println("The result of the concatenation is: " + s1 + s2);
    }
}
