package com.stuclg.serviceImp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stuclg.entity.College;
import com.stuclg.entity.Student;
import com.stuclg.service.StudentService;

@SpringBootTest
public class StudendServiceImpTest {

	@Autowired
	private StudentService studentService;

	@Test
	void toFetchAllStudentDetails() {
		Student firstStudent = studentService.saveStudentDetsils(inputStudent());
		System.out.println(firstStudent);
		Student secStudent = studentService.saveStudentDetsils(inputStudentWithClgCode());
		System.out.println(secStudent);

	}

	public Student inputStudent() {
		Student inStudent = new Student();
		inStudent.setStudentName("Sharanu");
		inStudent.setID(1L);
		return inStudent;

	}

	public Student inputStudentWithClgCode() {
		Student inStudent = new Student();
		inStudent.setStudentName("Sandy");
		inStudent.setID(3L);
		inStudent.setCollege(inputCollege());
		return inStudent;
	}

	public College inputCollege() {
		College inputCollege = new College();
		inputCollege.setCollegeID("1S");
		inputCollege.setID(1L);
		return inputCollege;
	}
};