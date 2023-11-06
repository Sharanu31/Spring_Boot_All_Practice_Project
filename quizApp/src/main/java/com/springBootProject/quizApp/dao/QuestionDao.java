package com.springBootProject.quizApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springBootProject.quizApp.entity.Question;

// this is the repository layer but with name dao


@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

	List<Question> findByCategory(String category);

	
	@Query(value="SELECT * FROM ( SELECT *  FROM question  ORDER BY DBMS_RANDOM.value) WHERE  category=?1 and  ROWNUM <=?2",nativeQuery = true)
	List<Question> findRandomQuestionByCategory(String category, int numQ);
}
