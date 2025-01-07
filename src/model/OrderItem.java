package model;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }



    @Override
    public String toString() {
        return "OrderItem{" +
                "quantity=" + quantity +
                ", product=" + product  + ", Subtotal=" + subTotal() + "\n";
    }

    public double subTotal(){
        return quantity * price;
    }
}
