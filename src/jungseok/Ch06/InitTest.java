package jungseok.Ch06;

public class InitTest {
    static int cv = 1; // 클래스변수
    int iv = 1; // 인스턴스 변수   ==== 멤버변수들 ==== 명시적 초기화
    {
        iv = 2; // 인스턴스 초기화 블럭
        System.out.println(iv);
    }
    InitTest() { // 생성자
        iv = 3;
        System.out.println(iv);
    }

    public static void main(String[] args) {

        System.out.println("InitTest 인스턴스 변수 확인");
        new InitTest();
    }
}
