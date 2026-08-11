package com.nit.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.ArchiveDocument;

public interface ArchiveDocumentRepository extends JpaRepository<ArchiveDocument, Long> {

}
