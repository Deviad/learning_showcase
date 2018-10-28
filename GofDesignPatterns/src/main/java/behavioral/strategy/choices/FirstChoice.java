package behavioral.strategy.choices;

public class FirstChoice implements IChoice {
    @Override
    public void getChoice(String s1, String s2) {
        System.out.println("Add numbers");
        int int1, int2, sum;

        int1 = Integer.parseInt(s1);
        int2 = Integer.parseInt(s2);
        sum = int1+ int2;

        System.out.println("The result of the addition is: " + sum);

    }
}
