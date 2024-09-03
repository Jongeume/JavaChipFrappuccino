package jungseok.Ch07;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        b.buy(new Computer3());
        b.buy(new TV3());
        b.buy(new Audio3());
        System.out.println();
        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
        System.out.println("현재 보너스는 " + b.bonusPoint + "점 입니다.");
        System.out.println();

        b.summary();
    }
}

class Buyer3 {
    int money = 1000;
    int bonusPoint = 0;
    Product3[] item = new Product3[10];
    int i = 0;
    int count = 0;

    void buy(Product3 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;
        count = i;
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";
        for (int i = 0; i < item.length; ++i) {
            if (item[i] == null) break;
            sum += item[i].price;
            //itemList += item[i] + ", ";
            //count = 물건 갯수
            itemList += (i+1 == count) ?  item[i] : item[i] + ", ";
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

class Product3 {
    int price;
    int bonusPoint;


    public Product3(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Computer3 extends Product3 {

    Computer3() {
        super(100);
    }

    public String toString() {
        return "Computer";
    }
}

class TV3 extends Product3 {
    TV3() {
        super(200);
    }

    public String toString() {
        return "TV";
    }
}

class Audio3 extends Product3 {
    Audio3() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}


