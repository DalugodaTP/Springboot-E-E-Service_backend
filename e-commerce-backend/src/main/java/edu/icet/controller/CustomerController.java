package edu.icet.controller;

import edu.icet.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RequestMapping("/customer")
public interface CustomerController {

    @PostMapping("/save")
    boolean saveCustomer(@RequestBody CustomerDto dto) throws SQLException, ClassNotFoundException;

    @PutMapping("/update")
    boolean updateCustomer(@RequestBody CustomerDto dto) throws SQLException, ClassNotFoundException;

    @DeleteMapping("/delete")
    boolean deleteCustomer(@RequestBody CustomerDto dto) throws SQLException, ClassNotFoundException;

    @GetMapping("/get/list")
    List<CustomerDto> getCustomer() throws SQLException, ClassNotFoundException;

    @GetMapping("/get/{id}")
    CustomerDto getCustomerById(@PathVariable("id") String id) throws SQLException, ClassNotFoundException;
}