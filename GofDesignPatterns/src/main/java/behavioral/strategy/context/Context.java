package behavioral.strategy.context;

import behavioral.strategy.choices.IChoice;

public class Context {
    IChoice choice;

    public void setChoice(IChoice ic) {
        choice = ic;
    }

    public void showChoice (String s1, String s2) {
        choice.getChoice(s1, s2);
    }

}
