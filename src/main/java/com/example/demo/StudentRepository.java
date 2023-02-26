package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer>{

	@Query("SELECT f FROM Student f where f.studentName = :firstName")
	List<Student> rraj(@Param("firstName") String firstName);
	
}
