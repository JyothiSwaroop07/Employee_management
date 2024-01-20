// Write your code here
package com.example.employee.repository;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.employee.model.*;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee newEmployee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
}
