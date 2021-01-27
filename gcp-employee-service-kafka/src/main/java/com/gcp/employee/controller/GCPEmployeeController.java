package com.gcp.employee.controller; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gcp.employee.dao.EmployeeRepository;
import com.gcp.employee.model.Employee;

// Add the controller.
@RestController
@RequestMapping(("/gcp/employeeService"))
public class GCPEmployeeController {

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