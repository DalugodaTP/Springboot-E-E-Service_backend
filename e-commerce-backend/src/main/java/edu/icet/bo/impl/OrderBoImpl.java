package edu.icet.bo.impl;

import edu.icet.bo.OrderBo;
import edu.icet.dao.OrderDao;
import edu.icet.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Service
public class OrderBoImpl implements OrderBo {
    @Autowired
    OrderDao orderDao;
    @Override
    public boolean saveOrder(OrderDto dto) throws SQLException, ClassNotFoundException {
        return orderDao.saveOrder(dto);
    }

    @Override
    public OrderDto lastOrder() throws SQLException, ClassNotFoundException {
        return orderDao.lastOrder();
    }
}
