package jungseok.Ch03;

public class OperatorEx7 {
    public static void main(String[] args) {

        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f;
        /*
        (int) (pi * 1000)
        = (int) (3.141592 * 1000)
        = (int) 3141.592
        = 3141

        3141 / 1000f
        = 3.141
        */
        System.out.print(shortPi);

        System.out.println();

        shortPi = pi * 1000 / 1000;
        /*
        pi * 1000
        = 3.141592f * 1000
        = 3.141592f * 1000f
        = 3141.592f

        3141.592f / 1000
        = 3141.592f / 1000f
        = 3.141592
        */
        System.out.print(shortPi);

        System.out.println();

        shortPi = (int)pi * 1000 / 1000;
        /*
        (int)pi * 1000
        = (int) 3.141592 * 1000
        = 3 * 1000
        = 3000

        3000 / 1000
        = 3
        = 3.0
        */
        System.out.print(shortPi);


    }
}
