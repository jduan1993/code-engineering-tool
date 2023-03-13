package com.hsbc.cet.service;

import com.hsbc.cet.entity.Order;
import com.hsbc.cet.tool.DatabaseConnection;

public class OrderService {
    private DatabaseConnection conn;

    public OrderService() {
        conn = new DatabaseConnection();
    }

    public void placeOrder(Order order) {
        conn.connect();
        conn.execute("INSERT INTO orders (customer_id, amount) VALUES (" + order.getCustomerId() + ", " + order.getAmount() + ")");
        conn.close();
        EmailService.sendConfirmationEmail(order.getCustomerId(), "Your order has been placed.");
    }
}
