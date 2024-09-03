package jungseok.Ch07;

import static java.lang.System.*;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();
        if (fe instanceof FireEngine) {
            out.println("This is a FireEngines Instance");
        }
        if (fe instanceof Car) {
            out.println("This is a Car Instance");
        }
        if (fe instanceof Object) {
            out.println("This is a Object Instance");
        }
        out.println(fe.getClass().getName());
    }
}

