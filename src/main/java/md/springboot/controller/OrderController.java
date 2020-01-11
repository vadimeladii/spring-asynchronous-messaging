package md.springboot.controller;

import md.springboot.dto.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("order")
public interface OrderController {

    @PostMapping
    void sendOrder(@RequestBody Order order);
}
