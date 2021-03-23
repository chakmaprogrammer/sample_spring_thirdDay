package com.example_spring.complete.fifthDay.employeeT5.service;

import com.example_spring.complete.fifthDay.employeeT5.dao.EmployeeT5Dao;
import com.example_spring.complete.fifthDay.employeeT5.entity.EmployeeT5;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeT5Service {


  private final EmployeeT5Dao employeeT5Dao;

  public EmployeeT5Service(EmployeeT5Dao employeeT5Dao) {
    this.employeeT5Dao = employeeT5Dao;
  }


  public List< EmployeeT5 > findAll() {
    return employeeT5Dao.findAll();
  }


  public EmployeeT5 findById(Integer id) {
    return employeeT5Dao.getOne(id);
  }


  public EmployeeT5 persist(EmployeeT5 employeeT5) {

    return employeeT5Dao.save(employeeT5);
  }


  public void deleteById(Integer id) {
    employeeT5Dao.deleteById(id);
  }
}
