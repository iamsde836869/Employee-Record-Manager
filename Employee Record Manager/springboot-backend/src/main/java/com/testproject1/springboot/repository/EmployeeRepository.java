package com.testproject1.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testproject1.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
