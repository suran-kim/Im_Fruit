package com.example.im_fruit.service;

import com.example.im_fruit.model.Email;
import com.example.im_fruit.model.Order;
import com.example.im_fruit.model.OrderItem;

import java.util.List;

public interface OrderService {
    Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems);
}
