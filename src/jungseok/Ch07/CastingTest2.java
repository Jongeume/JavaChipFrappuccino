package jungseok.Ch07;

public class CastingTest2 {
    public static void main(String[] args){
        Car car = new Car();
        Car car2 = null;
        Car car3 = new FireEngine();
        FireEngine fe = null;

        car.drive();
        car3.drive();
        fe =(FireEngine)car;
        fe.drive();
        car2 = fe; //car2 = (Car)fe;

        /*
        에러 발생 : 참조변수 car2는 Car 타입이기에 Car 타입의 인스턴스만 사용이 가능하다.
        참조변수는 fe는 FireEngine 타입이고 Car의 자손이며 조상보다 더 많은 멤버를 가지고 있다.
        자손타입의 참조변수가 조상타입의 인스턴스를 참조하는 것은 불가능하다.
        왜냐하면 조상 멤버의 수가 자손 멤버의 수보다 적기에 없는 멤버를 사용할 수 있기 때문이다. (조상 멤버 < 자손 멤버)
        자손타입에서 사용할 수 있는 멤버가 조상 타입의 인스턴스에서는 없을 수도 있기 떄문이다.

        Car car = new FireEngine(); 은 가능하다.
        Car 타입이 FireEngine 타입의 조상이기에 Car 타입의 모든 멤버가 FireEngine 타입의 멤버에도 포함되기 때문이다.
        */
        car2.drive();
    }
}
