package md.springboot.controller;

import md.springboot.dto.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("order")
public interface OrderController {

    @GetMapping
    Order receive();

    @GetMapping("all")
    List<Order> receiveAll();

    @PostMapping
    void send(@RequestBody Order order);
}
