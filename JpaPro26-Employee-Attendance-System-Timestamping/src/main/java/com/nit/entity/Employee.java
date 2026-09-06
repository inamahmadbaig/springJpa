package com.nit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Employee_Attendance_System")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@SequenceGenerator(name = "gen",sequenceName = "employee_Id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gen",strategy = GenerationType.SEQUENCE)
	private Long employeeId;
	@NonNull
	private String employeeName;
	@NonNull
	private String department;
	@NonNull
	private Double salary;
	@CreationTimestamp
	private LocalDateTime createdDate;
	@UpdateTimestamp
	private LocalDateTime updatedDate;
}
