package edu.icet.controller.impl;

import edu.icet.bo.OrderBo;
import edu.icet.controller.OrderController;
import edu.icet.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
public class OrderControllerImpl implements OrderController {
    @Autowired
    OrderBo orderBo;
    @Override
    public boolean saveOrder(OrderDto dto) throws SQLException, ClassNotFoundException {
        return orderBo.saveOrder(dto);
    }

    @Override
    public OrderDto lastOrder() throws SQLException, ClassNotFoundException {
        return orderBo.lastOrder();
    }
}
