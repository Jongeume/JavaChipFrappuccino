package jungseok.Ch02;

import java.util.Scanner;

public class FlowEx14 {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("*을 출력한 라인의 수를 입력하세요. >");

        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j >= num + 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf("0");
                }
            }
            System.out.println();
        }
    }
}
