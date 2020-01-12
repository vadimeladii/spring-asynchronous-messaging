package md.springboot.receiver.amqp;

import lombok.RequiredArgsConstructor;
import md.springboot.dto.Order;
import md.springboot.receiver.OrderReceiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderReceiverPullAMQP implements OrderReceiver {

    private final RabbitTemplate rabbitTemplate;

    @Override
    public Order receive() {
        return (Order) rabbitTemplate.receiveAndConvert("springboot2.order");
    }
}
