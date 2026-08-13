package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class EmployeeResume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	@NonNull
	private String employeeName;
	@NonNull
	private String designation;
	@NonNull
	@Lob
	private byte[] resumeContent;
	
	@Override
	public String toString() {
		return "EmployeeResume [employeeId=" + employeeId + ", employeeName=" + employeeName + ", designation="
				+ designation + ", resumeContent=" + resumeContent.length + "]";
	}
	
	
}
