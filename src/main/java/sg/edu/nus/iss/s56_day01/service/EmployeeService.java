package sg.edu.nus.iss.s56_day01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import sg.edu.nus.iss.s56_day01.model.Employee;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee("1", "Shery", "Liu"));
        employees.add(new Employee("2", "Lily", "Hua"));
        employees.add(new Employee("2", "Mary", "Tang"));
    }

    // public EmployeeService(List<Employee> employees) {
    // this.employees = employees;
    // }

    public List<Employee> getAllEmployee() {
        return this.employees;
    }

    public List<Employee> getEmployeesByLastName(String lastName) {
        List<Employee> filterEmployees = employees.stream().filter(emp -> emp.getLastName().equals(lastName)).toList();
        return filterEmployees;
    }

}
