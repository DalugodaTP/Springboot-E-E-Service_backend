package edu.icet.controller.impl;

import edu.icet.bo.CustomerBo;
import edu.icet.controller.CustomerController;
import edu.icet.dto.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    private CustomerBo customerBo;

    @Override
    public boolean saveCustomer(@RequestBody CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerBo.saveCustomer(dto);
    }

    @Override
    public boolean updateCustomer(@RequestBody CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerBo.updateCustomer(dto);
    }

    @Override
    public boolean deleteCustomer(@RequestBody CustomerDto dto) throws SQLException, ClassNotFoundException {
        return customerBo.deleteCustomer(dto);
    }

    @Override
    public List<CustomerDto> getCustomer() throws SQLException, ClassNotFoundException {
        return customerBo.allCustomers();
    }

    @Override
    public CustomerDto getCustomerById(@PathVariable("id") String id) throws SQLException, ClassNotFoundException {
        return customerBo.searchCustomer(id);
    }
}
