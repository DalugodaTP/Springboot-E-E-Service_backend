package edu.icet.dao;

import edu.icet.dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
    boolean saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    boolean deleteCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    List<CustomerDto> allCustomers() throws SQLException, ClassNotFoundException;
    CustomerDto searchCustomer(String id) throws SQLException, ClassNotFoundException;
}
