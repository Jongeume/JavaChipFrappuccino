package jungseok.Ch03;

public class OperatorEx4 {
    public static void main(String[] args) {

        byte a = 5;
        byte b = 5;
        byte c = (byte) (a + b);
        /*
        a, b 둘다 byte 타입이지만 산술연산자를 이용해서 연산을 할때는 int 타입으로 자동형변환이 된다.
        a+b 는 int 타입이기에 c에 참조할려면 명시를 해줘야한다.
        */
        System.out.printf("%d%n", c);

        int d = 1000000;
        int e = 2000000;
        long f = d * e;
        System.out.printf("%d%n", f);
        /*
        d, e 둘다 int 타입이면 연산을 할때 int 값이기에 참조하는 변수값의 타입이 long이여도 int타입의 값으로 참조되기에 오류가 난다.
        따라서 long 타입을 명시해줘야한다.
        */

        f = (long) (d * e);
        System.out.printf("%d%n", f);
        /*
        마찬가지로 (d * e)식에 long 타입을 명시해줘도 (d * e)는 int 타입으로 연산된 값에 long타입을 형변환하는 것이기 때문에 똑같이 오류가 난다.
        */

        f = (long) d * e;
        System.out.printf("%d%n", f);
        /*
        변수 d에 long 타입으로 형변환 시켜주면 int 타입은 e는 자동으로 큰 타입인 long으로 형변환되어 연산하게 된다.
        (long) d * e
        =  1000000L * 2000000
        =  1000000L * 2000000L
        =  2000... L
        */
    }
}
