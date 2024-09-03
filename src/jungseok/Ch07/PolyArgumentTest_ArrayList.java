package jungseok.Ch07;

import java.util.ArrayList;

public class PolyArgumentTest_ArrayList {
    public static void main(String[] args) {
        Buyer5 b = new Buyer5();
        Computer5 c = new Computer5();
        TV5 t = new TV5();
        Audio5 a = new Audio5();


        b.buy(c);
        b.buy(c);
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

class Buyer5 {
    int money = 1000;
    int bonusPoint = 0;
    ArrayList<Product5> item = new ArrayList();

    void buy(Product5 p) {
        if (this.money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product5 p) {
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
            Product5 p = (Product5) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "이고 총 개수는 " + item.size() + "개 입니다.");
    }
}

class Product5 {
    int price;
    int bonusPoint;

    Product5(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class TV5 extends Product5 {
    TV5() {
        super(200);
    }

    public String toString() {
        return "TV";
    }
}

class Computer5 extends Product5 {
    Computer5() {
        super(100);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio5 extends Product5 {
    Audio5() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}