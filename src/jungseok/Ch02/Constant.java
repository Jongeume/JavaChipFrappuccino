package jungseok.Ch02;

public class Constant {
    public static void main(String[] args) {

        int triangleArea = (20 * 10) / 2;
        int rectangleArea = 20 * 10;

        System.out.println("삼각형 : " + triangleArea);
        System.out.println("사각형 : " + rectangleArea);

        final int WIDTH = 20;
        final int HEIGHT = 10;

        System.out.println(WIDTH);
        System.out.println(HEIGHT);

        int triangleArea2 = (WIDTH * HEIGHT) / 2;
        int reactangleArea2 = WIDTH * HEIGHT;

        System.out.println("삼각형2 : " + triangleArea2);
        System.out.println("사각형2 : " + reactangleArea2);

        float a = 3.14F;
        float b = 3.14F;
        long c = 100L;
        System.out.println("c : " + c);
    }
}
