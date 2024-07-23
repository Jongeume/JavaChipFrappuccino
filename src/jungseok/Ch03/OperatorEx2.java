package jungseok.Ch03;

public class OperatorEx2 {
    public static void main(String[] args) {

        int result1 = 1_000_000 * 1_000_000 / 1_000_000;
        int result2 = 1_000_000 / 1_000_000 * 1_000_000; ;

        System.out.println(result1);
        System.out.println(result2);

        long result3 = 1_000_000 * 1_000_000 / 1_000_000;
        System.out.println(result3);

        long result4 = 1_000_000L * 1_000_000 / 1_000_000;
        System.out.println(result4);
    }
}
