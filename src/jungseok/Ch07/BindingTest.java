package jungseok.Ch07;

public class BindingTest {
    public static void main(String[] args) {
        Parent_BT p = new Child_BT();
        Child_BT c = new Child_BT();

        if (p instanceof Child_BT) {
            System.out.println("p는 Child_BT 인스턴스");
        }

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Parent_BT {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child_BT extends Parent_BT {
    int x = 200; //중복 정의

    void method() { // 중복 정의
        System.out.println("Child Method");
    }
}