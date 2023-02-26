package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="mick")
@Data
public class Student {

	@Id
	@GeneratedValue
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
}
