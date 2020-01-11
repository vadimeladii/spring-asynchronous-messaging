package md.springboot.controller.impl;

import lombok.RequiredArgsConstructor;
import md.springboot.controller.OrderController;
import md.springboot.dto.Order;
import md.springboot.receiver.OrderReceiver;
import md.springboot.sender.OrderSender;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderControllerImpl implements OrderController {

    private final OrderSender sender;
    private final OrderReceiver receiver;

    @Override
    public Order receive() {
        return receiver.receive();
    }

    @Override
    public void send(Order order) {
        sender.send(order);
    }
}
