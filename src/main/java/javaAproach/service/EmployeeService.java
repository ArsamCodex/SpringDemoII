package javaAproach.service;

import javaAproach.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee createEmployee (Employee employee);
    Employee updateEmployee(Employee employee);
    boolean deleteEmployee (Employee employee);

    Optional<Employee> findEmployeeById(long id);
    List<Employee> findAllEmployee();



}
