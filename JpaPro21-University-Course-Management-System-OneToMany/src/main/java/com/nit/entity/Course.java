package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Table(name = "course_university")
@ToString
public class Course {

	@Id
	@SequenceGenerator(name = "gens1",sequenceName = "course_id",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gens1",strategy = GenerationType.IDENTITY)
	private Long courseId;
	@NonNull
	private String courseName;
	@NonNull
	private String durationS;
	@NonNull
	@Positive
	private Double fee;
}
