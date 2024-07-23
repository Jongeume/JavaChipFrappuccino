package jungseok.Ch06;

public class FactorialTest3 {
    public static void main(String[] args) {

        int n = 21;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result = factorial(i);
            if (result == -1) {
                System.out.printf("유효하지 않은 값입니다. (0<n<20) : %d%n", n);
                break;
            }
            System.out.printf("%2d! = %20d%n", i, result);
        }
    }
    static long factorial(int n) {

        long result = 1;
        if (n <= 0 || n >= 21) return -1;
        while (n != 0) {
            result *= n--;
        }

        return result;
    }
}
