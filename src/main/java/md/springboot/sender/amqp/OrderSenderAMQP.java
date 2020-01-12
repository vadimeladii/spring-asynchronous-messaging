package md.springboot.sender.amqp;

import lombok.RequiredArgsConstructor;
import md.springboot.dto.Order;
import md.springboot.sender.OrderSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderSenderAMQP implements OrderSender {

    private final RabbitTemplate rabbitTemplate;

    @Override
    public void send(Order order) {
        rabbitTemplate.convertAndSend("springboot2.order", order);
    }
}
