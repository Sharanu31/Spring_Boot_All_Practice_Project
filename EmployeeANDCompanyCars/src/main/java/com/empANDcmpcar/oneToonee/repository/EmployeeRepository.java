package com.empANDcmpcar.oneToonee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empANDcmpcar.oneToonee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findByemployeeName(String employeeName);

}
