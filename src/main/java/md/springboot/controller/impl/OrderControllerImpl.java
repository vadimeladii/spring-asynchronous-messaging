package md.springboot.controller.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.controller.OrderController;
import md.springboot.dto.Order;
import md.springboot.sender.OrderSender;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController {

    private final OrderSender sender;

    public void sendOrder(Order order) {
        sender.send(order);
    }
}
