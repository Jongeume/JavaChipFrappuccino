package jungseok.Ch03;

public class OperatorEx7_2 {
    public static void main(String[] args) {

        double pi = 3.141592;
        double shortPi = 0;

        shortPi = (int) (pi * 1000 + 0.5) / 1000.0;
        System.out.print(shortPi);

        System.out.println();

        shortPi = Math.round(pi * 1000) / 1000.0;
        System.out.print(shortPi);

    }
}
