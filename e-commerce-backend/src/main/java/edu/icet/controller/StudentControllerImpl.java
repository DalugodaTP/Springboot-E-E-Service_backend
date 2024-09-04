package edu.icet.controller;

import edu.icet.bo.StudentBo;
import edu.icet.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class StudentControllerImpl implements StudentController{
    @Autowired
    StudentBo studentBo;
    @Override
    public List<CustomerEntity> getStudent() throws SQLException, ClassNotFoundException {
        return studentBo.getStudentList();
    }
}
