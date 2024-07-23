package jungseok.Ch06;

import java.util.Scanner;

public class FactorialTest2 {
    public static void main(String[] args){
        int n= 0;
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력하세요 >");
        n  = sc.nextInt();
        System.out.println("입력하신 수는 :" + n +"입니다.");
        result = factorial(n);
        if(result==-1){
            System.out.println("유효하지 않은 수입니다 다시 해주세요!");
        }
        System.out.println("팩토리얼 결과 : "+result);
    }
    static int factorial(int n){
        int result = 1;
        while(n!=0){
        if(n<=0 || n>=13) return -1;
            System.out.println(n+"번째 시작");
            result *= n--;
        }

        return result;
    }
}
