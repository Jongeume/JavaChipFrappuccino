package jungseok.Ch07;

import static java.lang.System.*;

public class FinalCardTest {
    public static void main(String[] args) {
        FinalCard fc = new FinalCard("HEART", 10);
        FinalCard fc1 = new FinalCard();
        out.println(fc.KIND);
        out.println(fc.NUMBER);
        out.println(fc);
        out.println(fc1);
    }
}

class FinalCard {
    static int width = 100;
    static int height = 250;
    final int NUMBER;
    final String KIND;

    FinalCard(String kind, int number) {
        NUMBER = number;
        KIND = kind;
    }

    FinalCard() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}
