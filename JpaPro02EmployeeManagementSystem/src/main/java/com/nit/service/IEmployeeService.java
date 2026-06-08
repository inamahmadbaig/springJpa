package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.Employee;

public interface IEmployeeService {

    // Insert Single Employee
    public void insertSave(Employee employee);

    // Insert Multiple Employees
    public void insertSaveAll(List<Employee> employees);

    // View Employee By ID
    public Optional<Employee> viewEmployeeById(Integer id);

    // View All Employees
    public Iterable<Employee> viewAllEmployees();

    // Check Employee Exists
    public boolean checkEmployeeExists(int id);

    // Count Total Employees
    public long countTotalEmployees();

    // Update Employee
    public Employee updateByID(int id, Employee employee);

    // Delete Employee By ID
    public void deleteEmployeeById(int id);

    // Delete Employee Record
    public void deleteEmployeeRecord(Employee employee);

    // Delete Multiple Employee Records
    public void deleteMultipleEmployeeRecord(List<Employee> employees);

    // Delete All Employees
    public void deleteAllEmployees();
}