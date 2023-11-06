package com.empANDcmpcar.oneToonee.service;

import java.util.List;

import com.empANDcmpcar.oneToonee.entity.Employee;

public interface EmployeeService {

	Employee saveEmployeeDetails(Employee employeeDet);

	List<Employee> getAllEmployees();

}
