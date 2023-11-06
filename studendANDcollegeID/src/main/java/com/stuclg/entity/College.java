package com.stuclg.entity;

import org.hibernate.sql.ast.tree.from.MappedByTableGroup;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iD;

	private String collegeID;

	
	
	 // @JsonIgnore
		
		  @OneToOne(mappedBy = "college")
		  
		  private Student student;



		public Long getiD() {
			return iD;
		}



		public void setiD(Long iD) {
			this.iD = iD;
		}



		public String getCollegeID() {
			return collegeID;
		}



		public void setCollegeID(String collegeID) {
			this.collegeID = collegeID;
		}



		public Student getStudent() {
			return student;
		}



		public void setStudent(Student student) {
			this.student = student;
		}
		 
	 
	 

}
