package jungseok.Ch03;

public class OperatorEx8 {
    public static void main(String[] args) {

        int x = 10;
        int y = 8;

        System.out.printf("x : %d 와 y : %d 를 나눈 몫 : %d, 나머지 : %d%n", x, y, x / y, x % y);

        /*
        음수일 경우, 우선 절댓값으로 계산한 후, 왼쪽 피연산자의 부호를 붙여주면 된다.
        */
        System.out.printf("-10 나누기 8의 나머지 : %d%n", -10 % 8);
        System.out.printf("10 나누기 8의 나머지 : %d%n", 10 % -8);
        System.out.printf("-10 나누기 -8의 나머지 : %d", -10 % -8);
    }
}
