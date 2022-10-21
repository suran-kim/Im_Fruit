package com.example.im_fruit.service;

import com.example.im_fruit.model.Email;
import com.example.im_fruit.model.Order;
import com.example.im_fruit.model.OrderItem;
import com.example.im_fruit.model.OrderStatus;
import com.example.im_fruit.repository.OrderRepository;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Service
public class DefaultOrderservice implements OrderService{

    private final OrderRepository orderRepository;


    public DefaultOrderservice(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Email email, String address, String postcode, List<OrderItem> orderItems) {
        Order order = new Order(
                UUID.randomUUID(),
                email,
                address,
                postcode,
                orderItems,
                OrderStatus.ACCEPTED,
                LocalDateTime.now(),
                LocalDateTime.now());
        return orderRepository.insert(order);
    }
}
