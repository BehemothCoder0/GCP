package com.gcp.employee.dao;

import org.springframework.data.repository.CrudRepository;
import com.gcp.employee.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}