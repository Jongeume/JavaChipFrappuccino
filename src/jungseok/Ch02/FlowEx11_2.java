package jungseok.Ch02;

import java.util.Scanner;

public class FlowEx11_2 {
    public static void main(String[] args) {

        String reg = " ";
        int regLength = 0;
        char gender = ' ';

        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("주민등록번호를 입력해주세요(123456-1234567>");
            reg = sc.nextLine();
            regLength = reg.length();
            if (regLength < 14) {
                System.out.println("잘못입력하셨습니다. 다시입력해주세요 ");
            } else if (regLength > 14) {
                System.out.println("잘못입력하셨습니다. 다시입력해주세요 ");
            }
        } while (regLength != 14); // true면 while 빠져나옴
        gender = reg.charAt(7);
        // System.out.printf("타입 %c%n ", gender);
        switch (gender) {
            case '1':
            case '3':
                if (gender == '1') {
                    System.out.println("당신은 2000년대 이전에 태어난 남성입니다.");
                } else {
                    System.out.println("당신은 2000년대 이후에 태어난 남성입니다.");
                }
                break;
            case '2':
            case '4':
                if (gender == '2') {
                    System.out.println("당신은 2000년대 이전에 태어난 여성입니다.");
                } else {
                    System.out.println("당신은 2000년대 이전에 태어난 여성입니다.");
                }
                break;
            default:
                System.out.println("유효하지않은 주민등록번호입니다.");
        }
    }
}
