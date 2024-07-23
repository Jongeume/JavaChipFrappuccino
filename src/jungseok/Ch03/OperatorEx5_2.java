package jungseok.Ch03;

public class OperatorEx5_2 {
    public static void main(String[] args) {

        char i = 'a';
        char j = ' ';
        int k = 0;


        /*
        리터럴 연산
        컴파일러가 'a'+1의 값을 98, b로 계산해준 후
        참조할려는 변수의 타입에 맞게 값을 넣어줌.

        수식에 변수가 없고 리터럴만 있기 때문에 컴파일러가 미리 계산 가능.
        */
        j = 'a' + 1;
        k = 'a' + 1;
        System.out.print("j = " + j);
        System.out.println();
        System.out.print("k = " + k);
        System.out.println();

        // j = i + 1; 형변환 오류 j는 char 타입이지만 (i+1) 는 int 타입이다.
        // System.out.print("j = " + j);
        k = i + 1; // 자동형변환 (int)i + (int)1;
        System.out.print("k = " + k);
    }
}
