package md.springboot.receiver.jms;

import lombok.RequiredArgsConstructor;
import md.springboot.dto.Order;
import md.springboot.receiver.OrderReceiver;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class OrderReceiverPushJMS implements OrderReceiver {

    private List<Order> orders = new ArrayList<>();

    @Override
    public Order receive() {
        return orders.stream().reduce((first, second) -> second).orElse(null);
    }

    public List<Order> receiveList() {
        return orders;
    }

//    @JmsListener(destination = "springboot2.order.queue")
    private void listen(Order order) {
        orders.add(order);
    }
}
