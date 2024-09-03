package jungseok.Ch07;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Computer());
        b.buy(new TV());

        System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
        System.out.println("현재 보너스는 " + b.bonus + "점 입니다.");
    }
}


class Product {

    static int price; // 제품의 가격
    static int bonus; // 제품구매 시 제공하는 보너스 점수
    static Product p = new Product(price);

    Product(int price) {
        this.price = price;
        this.bonus = (int) (price / 10.0); // 보너스는 제품가격의 10%
    }
}

class Buyer { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonus = 0; // 보너스

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonus += p.bonus; // 제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

class TV extends Product {
    TV() {
        // 조상 클래스의 생성자 Product()를 호출한다.
        super(200); // TV의 가격을 100만원으로 한다.
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(100);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}