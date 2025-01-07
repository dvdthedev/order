package model;

import model.enums.OrderStatus;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment = Date.from(Instant.now());
    private OrderStatus status;

    private List<OrderItem> itens = new ArrayList<>();

    public void addItem(OrderItem item){
        itens.add(item);
    }

    public void removeItem(OrderItem item){
        itens.remove(item);
    }

    public void total(){
     double accumulator;
     for(int i = 0; i < itens.toArray().length; i++){
        
     }

    }
}
