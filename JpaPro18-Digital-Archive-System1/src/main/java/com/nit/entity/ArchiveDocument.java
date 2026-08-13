package com.nit.entity;

import java.util.Arrays;

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
public class ArchiveDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long documentId;
	@NonNull
	private String documentTitle;
	@NonNull
	private String ownerName; 
	@NonNull
	private String fileType;
	@NonNull
	@Lob
	private byte[] documentData;
	@Override
	public String toString() {
		return "ArchiveDocument [documentId=" + documentId + ", documentTitle=" + documentTitle + ", ownerName="
				+ ownerName + ", fileType=" + fileType + ", documentData=" +documentData.length+"]";
	}
	
	
}
