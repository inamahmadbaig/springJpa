package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.ArchiveDocument;

public interface IArchiveDocumentService {

	public List<ArchiveDocument> save(List<ArchiveDocument> archiveDocuments);
	public List<ArchiveDocument> viewAll();
	public Optional<ArchiveDocument> viewByID(Long id);
	public ArchiveDocument updateBinerFill(ArchiveDocument archiveDocument);
	public void deleteDataByID(Long id);
}
