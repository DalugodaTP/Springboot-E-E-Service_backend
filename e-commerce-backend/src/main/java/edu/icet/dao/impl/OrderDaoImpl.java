package edu.icet.dao.impl;

import edu.icet.dao.OrderDao;
import edu.icet.dao.OrderDetailsDao;
import edu.icet.db.DBConnection;
import edu.icet.dto.OrderDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDaoImpl implements OrderDao {
    OrderDetailsDao orderDetailsModel = new OrderDetailsDaoImpl();
    @Override
    public boolean saveOrder(OrderDto dto) throws SQLException, ClassNotFoundException {
        Connection connection = null;
        try{
            connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);

            String sql = "INSERT INTO orders VALUES(?,?,?)";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, dto.getOrderId());
            pstm.setString(2, dto.getDate());
            pstm.setString(3, dto.getCustId());

            //--if the data was saved, now we need to save order details
            if (pstm.executeUpdate()>0){
                boolean isDetailSaved = orderDetailsModel.saveOrderDetails(dto.getDto());
                if (isDetailSaved){
                    connection.commit();
                    return true;
                }
            }
        }catch (SQLException | ClassNotFoundException ex){
            //--if order details failed then rollback the changes
            connection.rollback();
        }finally {
            //--reset autocommit to auto save
            connection.setAutoCommit(true);
        }
        return false;
    }

    @Override
    public OrderDto lastOrder() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM orders ORDER BY id DESC LIMIT 1";
        PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        ResultSet resultSet = pstm.executeQuery();
        if (resultSet.next()){
            return new OrderDto(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    null
            );
        }
        return null;
    }
}
