package jungseok.Ch06;

import java.util.Scanner;

public class FactorialTest {
    public static void main(String[] args) {

        //--------------------------------------------------
        int n = 0;
        int a = 1;
        long result = 0l;

        Scanner sc = new Scanner(System.in);
        System.out.print("1을 제외한 나머지 수를 입력해주세요. > ");
        n = sc.nextInt();
        result = factorial(n);
        System.out.println(result);
        //-----------------------------------------------------
        System.out.print("입력한 수를 팩토리얼 합니다 시작 : " + n);
        while (n != 1) {
            if(n<=0 || n>=13) break;
            a *= n;
            System.out.print("x" + (n - 1));
            --n;
        }
        System.out.println();
        System.out.print("결과: " + a);
    }
    static long factorial(int a) {

        long result = 0l;
        if(a<=0 || a>=13) return 1;
        if (a == 1) {
            System.out.println("저는 " + a + "번째 입니다.");
            result = 1;
        } else {
            System.out.println("저는 " + a + "번째 입니다.");
            result = a * factorial(a - 1);
        }

        System.out.println(a + "번째 메서드 끝 result : " + result);
        return result;
    }
}
