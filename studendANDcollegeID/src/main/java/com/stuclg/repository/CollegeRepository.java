package com.stuclg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stuclg.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long>{

}
