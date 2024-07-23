package jungseok.Ch03;

public class OperatorEx9 {
    public static void main(String[] args) {

        System.out.printf("10 == 10.0f  \t %b%n", 10 == 10.0f);
        System.out.printf("'0'== 0      \t %b%n", '0' == 0); // '0' = 47, 0 = 0
        System.out.printf("'A'== 65     \t %b%n", 'A' == 65);
        System.out.printf("'A' > 'B'    \t %b%n", 'A' > 'B'); // 'A' = 65, 'B' = 66
        System.out.printf("'A'+1 != 'B' \t %b%n", 'A' + 1 != 'B'); // ('A' + 1) = 66  == 'B' = 66

        System.out.println();

        float f = 0.1f;
        double d = 0.1;
        double d2 = (double) f;

        System.out.printf("10.0==10.0f %b%n", 10.0 == 10.0f);
        System.out.printf("0.1==0.1f %b%n", 0.1 == 0.1f);
        System.out.printf("f =%19.17f%n", f);
        System.out.printf("d =%19.17f%n", d);
        System.out.printf("d2 =%19.17f%n", d2);

        System.out.printf("d==f %b%n", d == f);
        System.out.printf("d==d2 %b%n", d == d2);
        System.out.printf("d2==f %b%n", d2 == f);
        System.out.printf("(float)d==f %b%n", (float) d == f);
    }
}
