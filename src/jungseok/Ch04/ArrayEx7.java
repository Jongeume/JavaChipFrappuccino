package jungseok.Ch04;

public class ArrayEx7 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for (int i = 0; i < ball.length; ++i) {
            ball[i] = i + 1;
        }
        int tmp = 0;
        int j = 0;

        for (int i = 0; i < ball.length; ++i) {
            j = (int) (Math.random() * ball.length); // 0~44
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }
        for (int i = 0; i < ball.length; ++i)
            System.out.printf("ball[%d] = %d%n", i, ball[i]);
    }
}
