package com.empANDcmpcar.oneToonee.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.empANDcmpcar.oneToonee.entity.Employee;
import com.empANDcmpcar.oneToonee.repository.EmployeeRepository;
import com.empANDcmpcar.oneToonee.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployeeDetails(Employee employeeDet) {
		Optional<Employee> dupEmployee = Optional
				.ofNullable(employeeRepository.findByemployeeName(employeeDet.getEmployeeName()));
		if (dupEmployee.isPresent()) {
			throw new IllegalArgumentException("Emplyee with name " + employeeDet.getEmployeeName() + " already exist");
		}
		if (!StringUtils.hasLength(employeeDet.getEmployeeName())) {
			throw new IllegalArgumentException("Emplyee with name " + employeeDet.getEmployeeName() + " already exist");

		}

		return employeeRepository.save(employeeDet);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

}
