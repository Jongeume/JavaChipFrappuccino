package jungseok.Ch03;

public class OperatorEx10 {
    public static void main(String[] args) {

        int x = 0;
        char ch = ' ';

        x = 15;
        System.out.printf("x =%2d, 10 < x && x < 20 = %b%n", x, 10 < x && x < 20);
        System.out.println();

        x = 6;
        System.out.printf("x =%2d, x%%2==0 || x%%3==0 = %b%n", x, x % 2 == 0 || x % 3 == 0);
        System.out.printf("x =%2d, x%%2==0 || x%%3==0 && x%%6!=0 = %b%n", x, x % 2 == 0 || x % 3 == 0 && x % 6 != 0);
        System.out.printf("(x =%2d, x%%2==0 || x%%3==0) && x%%6!=0 = %b%n", x, (x % 2 == 0 || x % 3 == 0) && x % 6 != 0);

        ch = '1';
        System.out.printf("ch='%c', '0' <= ch && ch <= '9' = %b%n", ch, '0' <= ch && ch <= '9');
        System.out.println();

        ch = 'a';
        System.out.printf("ch='%c', 'a' <= ch && ch <= 'z' = %b%n", ch, 'a' <= ch && ch <= 'z');
        System.out.println();

        ch = 'A';
        System.out.printf("ch='%c', 'A' <= ch && ch <= 'Z' = %b%n", ch, 'A' <= ch && ch <= 'Z');
    }
}
