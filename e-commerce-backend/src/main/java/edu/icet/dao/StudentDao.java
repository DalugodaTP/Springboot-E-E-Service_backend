package edu.icet.dao;

import edu.icet.entity.CustomerEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface StudentDao {
    public List<CustomerEntity> getStudentList() throws SQLException, ClassNotFoundException;
}
