package edu.icet.bo;

import edu.icet.dao.StudentDao;
import edu.icet.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class StudentBoImpl implements StudentBo{
    @Autowired
    StudentDao studentDao;
    @Override
    public List<CustomerEntity> getStudentList() throws SQLException, ClassNotFoundException {
        return studentDao.getStudentList();
    }
}
