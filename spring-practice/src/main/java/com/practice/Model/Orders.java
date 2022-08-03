package com.practice.Model;

import java.util.List;

public class Orders {
    private List<List<Order>> orders; //orders of many days
    private int revenueAday;

    private int no;

    public Orders(List<List<Order>> orders, int revenueAday ,int no) {
        this.orders = orders;
        this.revenueAday = revenueAday;
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public List<List<Order>> getOrders() {
        return orders;
    }

    public void setOrders(List<List<Order>> orders) {
        this.orders = orders;
    }

    public int getRevenueAday() {
        return revenueAday;
    }

    public void setRevenueAday(int revenueAday) {
        this.revenueAday = revenueAday;
    }
}
