package edu.icet.controller;

import edu.icet.dto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@RequestMapping("/order")
public interface OrderController {
    @PostMapping("/save")
    boolean saveOrder(@RequestBody OrderDto dto) throws SQLException, ClassNotFoundException;
    @GetMapping("/last/order")
    OrderDto lastOrder() throws SQLException, ClassNotFoundException;
}
