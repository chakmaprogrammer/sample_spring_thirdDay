package com.example_spring.complete.fifthDay.employeeT5.dao;

import com.example_spring.complete.fifthDay.employeeT5.entity.EmployeeT5;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeT5Dao extends JpaRepository< EmployeeT5, Integer> {


}
