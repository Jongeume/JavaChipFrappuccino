package hnm.project01;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Menu> cart;

    public Customer() {
        this.cart = new ArrayList<>();
    }

    public void addToCart(Menu menu) {
        cart.add(menu);
    }

    public List<Menu> getCart() {
        return cart;
    }
}