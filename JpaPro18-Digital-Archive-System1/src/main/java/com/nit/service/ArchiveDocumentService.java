package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.entity.ArchiveDocument;
import com.nit.repositery.ArchiveDocumentRepository;
@Service
public class ArchiveDocumentService implements IArchiveDocumentService {

	private ArchiveDocumentRepository archiveDocumentRepository;
	
	public ArchiveDocumentService(ArchiveDocumentRepository archiveDocumentRepository) {
		super();
		this.archiveDocumentRepository = archiveDocumentRepository;
	}

	@Override
	public List<ArchiveDocument> saveData(List<ArchiveDocument> archiveDocuments) {
		// TODO Auto-generated method stub
		return archiveDocumentRepository.saveAll(archiveDocuments);
	}

	@Override
	public Optional<ArchiveDocument> showByID(Long id) {
		// TODO Auto-generated method stub
		return archiveDocumentRepository.findById(id);
	}

	
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		archiveDocumentRepository.deleteById(id);

	}

	@Override
	public ArchiveDocument update(Long id, ArchiveDocument archiveDocuments) {
		// TODO Auto-generated method stub
		ArchiveDocument document = archiveDocumentRepository.findById(id).orElseThrow(() -> new RuntimeException("Document not found"));
		
		document.setDocumentData(archiveDocuments.getDocumentData());
		
		
		return archiveDocumentRepository.save(document);
	}

	@Override
	public List<ArchiveDocument> viewAll() {
		// TODO Auto-generated method stub
		return archiveDocumentRepository.findAll();
	}

}
