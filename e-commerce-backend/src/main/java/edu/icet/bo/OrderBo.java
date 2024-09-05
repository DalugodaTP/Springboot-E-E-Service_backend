package edu.icet.bo;

import edu.icet.dto.OrderDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLException;

public interface OrderBo {
    boolean saveOrder(@RequestBody OrderDto dto) throws SQLException, ClassNotFoundException;
    OrderDto lastOrder() throws SQLException, ClassNotFoundException;
}
