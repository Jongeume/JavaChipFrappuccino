package jungseok.Ch07;

import static java.lang.System.*;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = new FireEngine();

        fe.water();
        car = fe; //car = (Car)fe; 형변환이 생략된 상태, 캐스트 업
        // fe가 참조하고 있는 인스턴스 주소를 car도 참조함.
        //car.water(); car는 Car타입이기에 자손클래스 FireEngine의 멤버(메서드)를 사용하지는 못함.
        fe2 = (FireEngine) car; // 명시적 형변환, 캐스트 다운
        fe2.water(); // fe의 인스턴스 주소를 참조하기에 fe2의 인스턴스는 사용되지 않는다.
        fe.drive(); // 상속 받았기에 가능
    }
}

class Car {
    String color;
    int door;

    void drive() {
        out.println("drive, Brrrr~~~");
    }

    void stop() {
        out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        out.println("water!!!");
    }
}