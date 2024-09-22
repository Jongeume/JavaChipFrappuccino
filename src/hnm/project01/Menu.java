package hnm.project01;

public abstract class Menu {
    private String name;
    private int price;

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override //Object 클래스에서 오버라이딩함
    public String toString() {
        return name + ": " + price + "원";
    }
}
