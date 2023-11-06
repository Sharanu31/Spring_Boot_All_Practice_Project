package com.stuclg.serviceImp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.stuclg.entity.College;
import com.stuclg.entity.Student;
import com.stuclg.service.CollegeService;

@SpringBootTest
public class CollegeServiceImpTest {

	@Autowired
	private CollegeService collegeService;

	@Test
	void toCreateCollegeDetsils() {

	}

	@Test
	void fetchAllCollegeDetsils() {

		College inputCLg1 = collegeService.saveCollegeDetsils(inputCollege1());
		System.out.println(inputCLg1);

		College inputCLg2 = collegeService.saveCollegeDetsils(inputCollege2());
		System.out.println(inputCLg2);
		
		College inputCLg3 = collegeService.saveCollegeDetsils(inputCollegeWithStudentDet());
		System.out.println(inputCLg3);
	}

	public College inputCollege1() {
		College inputCollege = new College();
		inputCollege.setCollegeID("1SAD");
		inputCollege.setID(1L);
		return inputCollege;
	}

	public College inputCollege2() {
		College inputCollege = new College();
		inputCollege.setCollegeID("2SCD");
		inputCollege.setID(1L);
		return inputCollege;
	}

	public College inputCollegeWithStudentDet() {
		College inputCollege = new College();
		inputCollege.setCollegeID("1SAD");
		inputCollege.setID(1L);
		//inputCollege.setStudent(inputStudent());
		return inputCollege;
	}

	public Student inputStudent() {
		Student inStudent = new Student();
		inStudent.setStudentName("Sharanu");
		inStudent.setID(1L);
		return inStudent;

	}
}
