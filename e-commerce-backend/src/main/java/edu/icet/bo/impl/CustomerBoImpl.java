package edu.icet.bo.impl;

import edu.icet.bo.CustomerBo;
import edu.icet.dao.CustomerDao;
import edu.icet.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CustomerBoImpl implements CustomerBo {
    @Autowired
    CustomerDao customerDao;
    @Override
    public boolean saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerDao.saveCustomer(dto);
    }

    @Override
    public boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerDao.updateCustomer(dto);
    }

    @Override
    public boolean deleteCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerDao.deleteCustomer(dto);
    }

    @Override
    public List<CustomerDto> allCustomers() throws SQLException, ClassNotFoundException {
        return customerDao.allCustomers();
    }

    @Override
    public CustomerDto searchCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDao.searchCustomer(id);
    }
}
