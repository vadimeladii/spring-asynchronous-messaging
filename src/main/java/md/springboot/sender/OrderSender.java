package md.springboot.sender;

import md.springboot.dto.Order;

public interface OrderSender {
    void send(Order order);
}
