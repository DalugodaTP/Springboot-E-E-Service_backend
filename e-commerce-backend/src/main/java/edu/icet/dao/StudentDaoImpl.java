package edu.icet.dao;

import edu.icet.db.DBConnection;
import edu.icet.entity.CustomerEntity;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentDaoImpl implements StudentDao{
    @Override
    public List<CustomerEntity> getStudentList() throws SQLException, ClassNotFoundException {
        //--Create an arrayList to store the objects
        List list = new ArrayList<>();
//This is a test
        //--Create the sql statement
        String sql = "SELECT * FROM customer";

        //--Execute the query and get the result set using instance
        PreparedStatement pstm = DBConnection.getInstance().getConnection().prepareStatement(sql);

        //--Execute the query and get the result set
        ResultSet result = pstm.executeQuery();

        //--Process the result set
        while (result.next()) {
            //--Add the result set into the list as CustomerDto
            list.add(new CustomerEntity(
                    result.getString(1),
                    result.getString(2),
                    result.getString(3),
                    result.getDouble(4)
            ));
        }

        return list;
    }
}
