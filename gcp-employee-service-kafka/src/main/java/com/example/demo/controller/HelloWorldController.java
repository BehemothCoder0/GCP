package com.example.demo.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.model.Employee;

// Add the controller.
@RestController
public class HelloWorldController {

  @Autowired
  private EmployeeRepository employeeDao;

  @GetMapping("/hello")
  public String hello() {
    return "hello world!";
  }

  @GetMapping("/employee")
  public Iterable<Employee> employeeService(){
    Employee emp = new Employee();
    emp.setEmpName("Siddu");
    emp.setSalary(123.44);

    employeeDao.save(emp);

    Iterable<Employee> remp = employeeDao.findAll();
    return remp;
  }
}