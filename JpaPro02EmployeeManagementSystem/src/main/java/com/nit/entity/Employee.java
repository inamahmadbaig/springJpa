package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Employee_Table_All_Task")
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName;
	private String department;
	private double salary;
}
