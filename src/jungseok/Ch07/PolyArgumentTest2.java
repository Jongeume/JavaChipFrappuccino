package jungseok.Ch07;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(Computer2.getInstance());
        b.buy(TV2.getInstance());
        b.buy(Audio2.getInstance());

        b.buy(Computer2.getInstance());
        b.buy(Computer2.getInstance());
        //b.buy(new Computer2()); * 싱글톤 패턴을 사용하였기에 getInstance()를 통해서만 접근 가능

        System.out.println();
        System.out.println("현재 남은 돈은 " + b.getMoney() + "만원 입니다.");
        System.out.println("현재 보너스는 " + b.getBonus() + "점 입니다.");
    }
}

class Buyer2 {
    private int money = 1000;
    private int bonus = 0;

    public int getMoney() {
        return money;
    }

    public int getBonus() {
        return bonus;
    }

    void buy(Product2 p) {
        if (money < p.getPrice()) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.getPrice();
        bonus += p.getBonus();
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

class Product2 {
    private static int price;
    private static int bonus;

    private static volatile Product2 p; // 더블 체크

    Product2(int price) {
        this.price = price;
        this.bonus = (int) (price / 10.0); // 보너스는 제품 가격의 10퍼
    }

    public static Product2 getInstance() {
        if (p == null) { // 싱글톤 패턴
            synchronized (Product2.class) {
                if (p == null) {
                    p = new Product2(0);
                }
            }
        }
        return p;
    }

    public int getPrice() {
        return price;
    }

    public int getBonus() {
        return bonus;
    }
}

class Computer2 extends Product2 {
    private static Computer2 ci;

    private Computer2() {
        super(100);
    }

    public static Computer2 getInstance() {
        if (ci == null) { // 싱글톤 패턴
            ci = new Computer2();
        }else {
            ci = null;
            return Computer2.getInstance();
        }
        return ci;
    }

    public String toString() {
        return "Computer";
    }
}

class TV2 extends Product2 {
    private static TV2 ti;

    private TV2() {
        super(200);
    }

    public static TV2 getInstance() {
        if (ti == null) {
            ti = new TV2();
        }
        return ti;
    }

    public String toString() {
        return "TV";
    }
}

class Audio2 extends Product2 {
    private static Audio2 ai;

    private Audio2() {
        super(50);
    }

    public static Audio2 getInstance() {
        if (ai == null) {
            ai = new Audio2();
        }
        return ai;
    }


    public String toString() {
        return "Audio";
    }
}
