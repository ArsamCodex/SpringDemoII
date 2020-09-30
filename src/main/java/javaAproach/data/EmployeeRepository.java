package javaAproach.data;

import javaAproach.model.Employee;

import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {

    Employee createEmployee (Employee employee);
    Employee updateEmployee(Employee employee);
    boolean deleteEmployee (Employee employee);

    Optional<Employee> findEmployeeById(long id);
    List<Employee> findAllEmployee();

    }

