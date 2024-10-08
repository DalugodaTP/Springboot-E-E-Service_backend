package edu.icet.dao.impl;

import edu.icet.dao.OrderDetailsDao;
import edu.icet.db.DBConnection;
import edu.icet.dto.OrderDetailsDto;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class OrderDetailsDaoImpl implements OrderDetailsDao {
    @Override
    public boolean saveOrderDetails(List<OrderDetailsDto> list) throws SQLException, ClassNotFoundException {
        boolean isDetailsSaved = true;
        for (OrderDetailsDto dto:list) {
            String sql = "INSERT INTO orderdetail VALUES (?,?,?,?)";
            PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement(sql);
            //--Set the values into parameters
            pstm.setString(1, dto.getOrderId());
            pstm.setString(2, dto.getItemCode());
            pstm.setInt(3, dto.getQty());
            pstm.setDouble(4, dto.getUnitPrice());

            if(!(pstm.executeUpdate()>0)){
                isDetailsSaved =false;
            }
        }
        return isDetailsSaved;
    }
}
