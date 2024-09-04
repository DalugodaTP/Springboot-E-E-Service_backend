package edu.icet.controller;

import edu.icet.entity.CustomerEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/test")
public interface StudentController {
    @GetMapping("/get/student/list")
    public List<CustomerEntity> getStudent() throws SQLException, ClassNotFoundException;
}
