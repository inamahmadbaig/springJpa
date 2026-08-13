package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.ArchiveDocument;

public interface IArchiveDocumentService {

	public List<ArchiveDocument> saveData(List<ArchiveDocument> archiveDocuments);
	public Optional<ArchiveDocument> showByID(Long id);
	public ArchiveDocument update(Long id, ArchiveDocument archiveDocuments);
	public void deleteById(Long id);
	
	public List<ArchiveDocument> viewAll();
	
}
