package jungseok.Ch03;

import java.util.*;

public class OperatorEx10_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = ' ';
        while (true) {

            System.out.printf("문자를 하나 입력하세요. (종료코드 : !) > ");

            String input = sc.nextLine();
            ch = input.charAt(0);

            if (ch == '!') {
                System.out.println("종료하겠습니다.");
                break;
            }
            if ('0' <= ch && ch <= '9') {
                System.out.printf("입력하신 문자는 숫자이고 %c 입니다. %n", ch);
            }

            if ('a' <= ch && ch <= 'z' || 'A' <= ch && ch <= 'Z') {

                if (65 <= ch && ch <= 90) {
                    System.out.printf("입력하신 문자는 영문자이고 대문자이며 %c 입니다. %n", ch);
                } else if (97 <= ch && ch <= 122) {
                    System.out.printf("입력하신 문자는 영문자이고 소문자이며 %c 입니다. %n", ch);
                }
            }
        }
    }
}
