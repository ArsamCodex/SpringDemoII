package javaAproach.service;

import javaAproach.data.EmployeeRepository;
import javaAproach.model.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeService employeeService;

    public EmployeeServiceImpl(EmployeeService employeeService){
        this.employeeService = employeeService;
        //CONSTRUCTOR INJECTION
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        return false;
    }

    @Override
    public Optional<Employee> findEmployeeById(long id) {
        return Optional.empty();
    }

    @Override
    public List<Employee> findAllEmployee() {
        return null;
    }
}
