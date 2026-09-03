package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "Books_Management")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Setter
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	@NonNull
	private String bookTitle;
	@NonNull
	private String authorName;
	@NonNull
	private Double price;
	
	
}
