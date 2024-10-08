package jungseok.Ch02;

import java.util.Scanner;

// 주민등록번호 입력하기
public class FlowEx11 {
    public static void main(String[] args) {

        char gender = ' ';
        String regNo = " ";
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 주민번호를 입력하세요. (000000-0000000)>");
            regNo = sc.nextLine();
            int regNoLength = regNo.length();
            if (regNoLength == 14) {
                System.out.println("정상적으로 입력하셨습니다.");
                break;
            } else {
                System.out.println("잘못입력하셨습니다. 주민등록번호를 다시 입력해주세요");
                continue;
            }
        }
        gender = regNo.charAt(7); //charAt( 0 ~ length-1)
        System.out.println(gender);


        switch (gender) {
            case '1':
            case '3':
                switch (gender) {
                    case '1':
                        System.out.println("당신은 2000년 이전에 출생한 남자입니다. ");
                        break;
                    case '3':
                        System.out.println("당신은 2000년 이후에 출생한 남자입니다.");
                        break;
                }
                break;
            case '2':
            case '4':
                switch (gender) {
                    case '2':
                        System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
                        break;
                    case '4':
                        System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
                        break;
                }
                break;
            default:
                System.out.println("유효하지 않은 주민등록번호입니다.");
        }
    }
}
