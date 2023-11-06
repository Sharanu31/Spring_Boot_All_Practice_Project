package com.example.rev.serviceImpTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.example.rev.entity.Employee;
import com.example.rev.service.EmployeeService;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class EmployeeServiceImpTest {

	@Autowired
	private EmployeeService employeeService;

	@Test
	@Disabled
	void creatingEmployeeDetails() throws Exception {
		Employee outputEmployee = employeeService.saveDepartment(inputEmployee());
		assertEquals("Sharanu", outputEmployee.getEmpFirstName());
	}

	@Test
	@Disabled
	void throwAnExceptionWhenDuplicateEmpFirstNameCreated() throws Exception {
		employeeService.saveDepartment(inputEmployee());
		Employee outputEmployee = employeeService.saveDepartment(inputEmployee());
		assertEquals("Sharanu", outputEmployee.getEmpFirstName());
	}

	@Test
	@Disabled
	void toCheckAllTheEmployees() throws Exception {
		employeeService.saveDepartment(inputEmployee());
		employeeService.saveDepartment(inputEmployee1());
		assertTrue(employeeService.fetchAllDeparmtent().size() > 1);
	}

	@Test
	void updateEmployeeDetails() throws Exception {
		employeeService.saveDepartment(inputEmployee());
		Employee inputEmp = new Employee(1l, "Sharanappa", "B girigouder");
		Employee updatedEmp = employeeService.updateEmployeeDetails(1L, inputEmp);
		assertEquals("Sharanappa", updatedEmp.getEmpFirstName());
	}

	public Employee inputEmployee() {
		Employee emp = new Employee();
		emp.setId(1L);
		emp.setEmpFirstName("Sharanu");
		emp.setEmpLastName("Gouder");
		return emp;
	}

	public Employee inputEmployee1() {
		Employee emp = new Employee();
		emp.setId(2L);
		emp.setEmpFirstName("Sandy");
		emp.setEmpLastName("Unknow");
		return emp;
	}

}
