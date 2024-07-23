package jungseok.Ch02;

import java.util.Scanner;

public class StarWalking {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("*을 출력한 라인의 수를 입력하세요. > ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
