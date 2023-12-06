package com.liumou.homework3.BookSystem;

public class Order {
    private String orderId;
    private OrderItem items[];
    private double total;

    // 有参构造
    public Order(String orderId) {
        this.orderId = orderId;
        this.items = new OrderItem[3];
    }

    public Order() {
    }

    public Order(String orderId, OrderItem[] items, double total) {
        this.orderId = orderId;
        this.items = items;
        this.total = total;
    }

    // 获取订单号
    public String getOrderId() {
        return orderId;
    }

    // 获取订单列表
    public OrderItem[] getItems() {
        return items;
    }

    // 获取订单总额
    public double getTotal() {
        calTotal();
        return total;
    }

    // 指定一个订单项
    public void setItem(OrderItem item, int i) {
        this.items[i] = item;
    }

    // 计算订单总额
    public void calTotal() {
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i].getNum() * items[i].getBook().getPrice();
        }
        this.total = total;
    }

    /**
     * 设置
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 设置
     * @param items
     */
    public void setItems(OrderItem[] items) {
        this.items = items;
    }

    /**
     * 设置
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    public String toString() {
        return "Order{orderId = " + orderId + ", items = " + items + ", total = " + total + "}";
    }
}
