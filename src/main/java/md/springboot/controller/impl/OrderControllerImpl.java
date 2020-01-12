package md.springboot.controller.impl;

import md.springboot.controller.OrderController;
import md.springboot.dto.Order;
import md.springboot.receiver.OrderReceiver;
import md.springboot.sender.OrderSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderControllerImpl implements OrderController {

    @Autowired
    @Qualifier("orderReceiverPullAMQP")
    private OrderReceiver receiver;

    @Autowired
    @Qualifier("orderSenderAMQP")
    private OrderSender sender;

    @Override
    public Order receive() {
        return receiver.receive();
    }

    @Override
    public List<Order> receiveAll() {
        return receiver.receiveList();
    }

    @Override
    public void send(Order order) {
        sender.send(order);
    }
}
