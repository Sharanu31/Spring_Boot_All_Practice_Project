package com.empANDcmpcar.oneToonee.serviceImpTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.empANDcmpcar.oneToonee.entity.CompanyCar;
import com.empANDcmpcar.oneToonee.entity.Employee;
import com.empANDcmpcar.oneToonee.service.EmployeeService;

@SpringBootTest
public class EmployeeServiceImpTest {

	@Autowired
	private EmployeeService employeeService;

	/*
	 * @BeforeEach void setup() { Employee inputEmployee = new Employee();
	 * inputEmployee.setEmployeeName("Sharanu");
	 * inputEmployee.setEmployeeDepartment("Development");
	 * inputEmployee.setEmployeeCompnay("Yethi Consulting"); Mockito.when(null); }
	 */

	@Test
	@Disabled
	void createEmployeeWithThereDetails() {
		Employee inEmployee = inputEmployee1();
		Employee outEmployee = employeeService.saveEmployeeDetails(inEmployee);
		assertNotNull(outEmployee);
	}

	@Test
	@Disabled
	void getAllEmployeeDetails() {
		employeeService.saveEmployeeDetails(inputEmployee1());
		employeeService.saveEmployeeDetails(inputEmployee2());
		assertTrue(employeeService.getAllEmployees().size() > 1);
	}

	@Test
	void getAllEmployeeDetailsWithCompanyCar() {
		employeeService.saveEmployeeDetails(inputEmployeeWithCompanyCarDetails1());
		employeeService.saveEmployeeDetails(inputEmployeeWithCompanyCarDetails2());
		assertTrue(employeeService.getAllEmployees().size() > 1);
	}

	public Employee inputEmployee1() {
		Employee inputEmployee = new Employee();
		inputEmployee.setEmployeeName("Sharanu");
		inputEmployee.setEmployeeDepartment("Development");
		inputEmployee.setEmployeeCompnay("Yethi Consulting");
		return inputEmployee;
	}

	public Employee inputEmployee2() {
		Employee inputEmployee = new Employee();
		inputEmployee.setEmployeeName("Basavaraj");
		inputEmployee.setEmployeeDepartment("Bus Driver");
		inputEmployee.setEmployeeCompnay("BMTC");
		return inputEmployee;
	}

	public Employee inputEmployeeWithCompanyCarDetails1() {
		Employee inputEmployee = new Employee();
		inputEmployee.setEmployeeName("Yashu");
		inputEmployee.setEmployeeDepartment("Accountent");
		inputEmployee.setEmployeeCompnay("Bosch");
		inputEmployee.setCompanyCar(empCompanyCar1());
		return inputEmployee;
	}

	public Employee inputEmployeeWithCompanyCarDetails2() {
		Employee inputEmployee = new Employee();
		inputEmployee.setEmployeeName("Sunandha");
		inputEmployee.setEmployeeDepartment("Accountent");
		inputEmployee.setEmployeeCompnay("Bosch");
		inputEmployee.setCompanyCar(empCompanyCar2());
		return inputEmployee;
	}

	public CompanyCar empCompanyCar1() {
		CompanyCar inputCompanyCar = new CompanyCar();
		inputCompanyCar.setComoanyCarName("Swift");
		inputCompanyCar.setComoanyCarModel("1DF45");
		return inputCompanyCar;

	}

	public CompanyCar empCompanyCar2() {
		CompanyCar inputCompanyCar = new CompanyCar();
		inputCompanyCar.setComoanyCarName("TATA Punch");
		inputCompanyCar.setComoanyCarModel("1HGB5");
		return inputCompanyCar;

	}

}
