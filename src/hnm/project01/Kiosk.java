package hnm.project01;

import java.util.Scanner;

public class Kiosk {
    private Customer cu;
    private Scanner sc;
    private String[][] foodItems = {
            {"햄버거", "6000"},
            {"조각피자", "7000"},
            {"샌드위치", "4000"},
    };
    private String[][] drinkItems = {
            {"콜라", "2000"},
            {"사이다", "2000"},
            {"환타", "2000"}

    };
    private int total;


    public Kiosk() {
        this.cu = new Customer();
        this.sc = new Scanner(System.in);
    }

    public void start() {
        System.out.println("환영합니다! 메뉴를 선택해주세요.");
        boolean r = true;

        while (r) {
            this.total = Calculate.calcTotal(cu);
            showMenu();

            String itemName;
            int itemPrice;
            int choice = sc.nextInt();

            if (1 <= choice && choice <= foodItems.length) {
                int index = choice - 1;
                itemName = foodItems[index][0];
                itemPrice = Integer.parseInt(foodItems[index][1]);
                cu.addToCart(new Food(itemName, itemPrice));
            } else if (1 <= choice && choice <= drinkItems.length) {
                int index = choice - 1;
                itemName = drinkItems[index][0];
                itemPrice = Integer.parseInt(drinkItems[index][1]);
                cu.addToCart(new Drink(itemName, itemPrice));
            } else if (choice == foodItems.length + drinkItems.length + 1) {
                System.out.println("총 금액 : " + total + "원");
                r = false;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }

        sc.close();
    }

    private void showMenu() {
        System.out.println();
        System.out.println("[음식]");
        for (int i = 0; i < foodItems.length; ++i) {
            System.out.println((i + 1) + ". " + foodItems[i][0] + " (" + foodItems[i][1] + "원)");
        }
        System.out.println();
        System.out.println("[음료]");
        for (int i = 0; i < drinkItems.length; ++i) {
            System.out.println((i + foodItems.length + 1) + ". " + drinkItems[i][0] + " (" + drinkItems[i][1] + "원)");
        }
        System.out.println((foodItems.length + drinkItems.length + 1) + ". 결제하기");
        System.out.println();
        System.out.println("현재 장바구니 금액 : " + total +"원");
        System.out.println("선택 : ");
    }
}
