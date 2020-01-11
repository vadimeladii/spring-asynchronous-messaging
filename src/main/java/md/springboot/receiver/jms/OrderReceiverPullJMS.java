package md.springboot.receiver.jms;

import lombok.RequiredArgsConstructor;
import md.springboot.dto.Order;
import md.springboot.receiver.OrderReceiver;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderReceiverPullJMS implements OrderReceiver {

    private final JmsTemplate jmsTemplate;

    @Override
    public Order receive() {
        return (Order) jmsTemplate.receiveAndConvert();
    }
}
