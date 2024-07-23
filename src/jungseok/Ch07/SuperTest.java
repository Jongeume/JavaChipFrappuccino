package jungseok.Ch07;

public class SuperTest {
    public static void main(String[] args) {

        Child c = new Child();
        c.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent {
    Child() {

        this(100);
    }
    Child(int x) {

        this.x = x;
    }
    void method() {

        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
    }
}
