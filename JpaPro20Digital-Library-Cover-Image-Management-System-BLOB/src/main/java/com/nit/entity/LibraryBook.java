package com.nit.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class LibraryBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookId;
	@NonNull
	private String bookTitle;
	@NonNull
	private String authorName;
	@NonNull
	@Lob
	@Column(columnDefinition = "BLOB")
	private byte[] coverImage;
	@Override
	public String toString() {
		return "LibraryBook [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName
				+ ", coverImage=" + coverImage.length + "]";
	}
	
	
}
