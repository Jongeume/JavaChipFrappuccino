package jungseok.Ch03;

public class OperatorEx5 {
    public static void main(String[] args) {

        char c1 = 'a';
        char c2 = c1;
        char c3 = ' ';

        int i = c1 + 1;
        /*
        c1 + 1
        = c1 + (int) 1
        = (int) c1 + (int) 1
        = 97 + 1
        = 98
        */

        c3 = (char) (c1 + 1); // 97 + 1 = (char) 98 = b
        c2++; // 97 + 1 = (char) 98 = b
        c2++; // 98 + 1 = (char) 99 = c

        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
