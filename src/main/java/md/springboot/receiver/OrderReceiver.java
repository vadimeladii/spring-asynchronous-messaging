package md.springboot.receiver;

import md.springboot.dto.Order;

import java.util.List;

public interface OrderReceiver {
    Order receive();

    default List<Order> receiveList() {
        return List.of();
    }
}
