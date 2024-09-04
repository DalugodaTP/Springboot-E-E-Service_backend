package edu.icet.bo;

import edu.icet.entity.CustomerEntity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface StudentBo {
    public List<CustomerEntity> getStudentList() throws SQLException, ClassNotFoundException;
}
