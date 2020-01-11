package md.springboot.sender.jms;

import lombok.RequiredArgsConstructor;
import md.springboot.dto.Order;
import md.springboot.sender.OrderSender;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderSenderJMS implements OrderSender {

    private final JmsTemplate jmsTemplate;

    @Override
    public void send(Order order) {
        jmsTemplate.convertAndSend(order);
    }
}
