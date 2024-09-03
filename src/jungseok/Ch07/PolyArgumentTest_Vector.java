package jungseok.Ch07;

import java.util.*;

public class PolyArgumentTest_Vector {
    public static void main(String[] args) {
        Buyer4 b = new Buyer4();
        Computer4 c = new Computer4();
        TV4 t = new TV4();
        Audio4 a = new Audio4();

        b.buy(c);
        b.buy(t);
        System.out.println();
        b.summary();

        System.out.println();
        b.refund(c);
        b.refund(a);
        System.out.println();
        b.summary();
    }
}

class Buyer4 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();

    void buy(Product4 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product4 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";
        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        for (int i = 0; i < item.size(); ++i) {
            Product4 p = (Product4) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class Product4 {
    int price;
    int bonusPoint;

    Product4(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    /*Product4() {
        price = 0;
        bonusPoint = 0;
    }*/
}

class TV4 extends Product4 {
    TV4() {
        super(200);
    }

    public String toString() {
        return "TV";
    }
}

class Computer4 extends Product4 {
    Computer4() {
        super(100);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio4 extends Product4 {
    Audio4() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}