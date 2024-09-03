package jungseok.Ch07;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent_BT p = new Child_BT2();
        Child_BT2 c = new Child_BT2();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println("c.x = " + c.x);
        c.method();
    }
}

class Child_BT2 extends Parent_BT {

}