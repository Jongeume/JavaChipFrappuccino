package jungseok.Ch06;

public class VariableEx1 {
    static int t = 10; //클래스 변수
    int i = 5; // 인스턴스 변수
    public static void main(String[] args) {

        int i = 0;
        int t = 0;
        VariableEx1 ve = new VariableEx1();
        System.out.println("메인메서드의 지역변수입니다. : " + i);
        System.out.println("인스턴스 변수입니다. : " + ve.i);
        System.out.println("메인메서드의 지역변수입니다. : " + t);
        System.out.println("클래스 변수입니다. : " + VariableEx1.t);

     /*   ve.i = 30;
        System.out.println("인스턴스 변수입니다. : " + ve.i);
        VariableEx1.t = 20;
        System.out.println("클래스 변수입니다. : " + VariableEx1.t);*/

        System.out.println("인스턴스메서드를 통한 합계 입니다 : " + ve.sum());

//        System.out.println("클래스메서드를 통한 합계 입니다. : " + sum2());
    }
  /*  static int sum2() {

        System.out.println("나는 클래스메서드 안에 인스턴스변수에용 : " + i);
        return t + i;
    }*/
    int sum() {

        return t + i;
    }
}