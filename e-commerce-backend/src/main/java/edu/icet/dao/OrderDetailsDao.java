package edu.icet.dao;

import edu.icet.dto.OrderDetailsDto;

import java.sql.SQLException;
import java.util.List;

public interface OrderDetailsDao {
    boolean saveOrderDetails(List<OrderDetailsDto> list) throws SQLException, ClassNotFoundException;
}
