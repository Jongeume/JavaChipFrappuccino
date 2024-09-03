package jungseok.Ch07;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent_BT p = new Child_BT3();
        Child_BT3 c = new Child_BT3();

        System.out.println("p.x = " + p.x);
        p.method(); // 실제 인스턴스의 타입인 Child_BT3 클래스의 메서드가 사용된다.
        System.out.println();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Child_BT3 extends Parent_BT {
    int x = 200;

    void method() {
        System.out.println("x = " + x); // == this.x
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}