package edu.icet.dao;

import edu.icet.dto.OrderDto;

import java.sql.SQLException;

public interface OrderDao {
    boolean saveOrder(OrderDto dto) throws SQLException, ClassNotFoundException;
    OrderDto lastOrder() throws SQLException, ClassNotFoundException;
}
