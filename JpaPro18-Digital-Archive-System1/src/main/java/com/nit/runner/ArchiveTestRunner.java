package com.nit.runner;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.ArchiveDocument;
import com.nit.service.IArchiveDocumentService;
@Component
public class ArchiveTestRunner implements CommandLineRunner {

	private IArchiveDocumentService archiveDocumentService;
	
	public ArchiveTestRunner(IArchiveDocumentService archiveDocumentService) {
		super();
		this.archiveDocumentService = archiveDocumentService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		try {
			List<ArchiveDocument> list = List.of(
					new ArchiveDocument("Rcipt", "Inam", "pdf",Files.readAllBytes(Path.of("C:\\bol\\aaa.pdf")) ),
					new ArchiveDocument("Image", "Inam Baig", "Image",Files.readAllBytes(Path.of("C:\\bol\\women.jpg")) ),
					new ArchiveDocument("Image", "Aman", "Image",Files.readAllBytes(Path.of("C:\\bol\\women.jpg")) )
					);
			archiveDocumentService.saveData(list);
			System.err.println("Sava data ");
		} catch (Exception e) {
		e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("Retrieve by ID,");
			System.out.println(archiveDocumentService.showByID(3l));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("Update binary file,");
			ArchiveDocument archiveDocument = new ArchiveDocument();
			archiveDocument.setDocumentData(Files.readAllBytes(Path.of("C:\\bol\\ggg.pdf")));
			
			archiveDocumentService.update(3l, archiveDocument);
			System.out.println("save");
		} catch (Exception e) {
			System.out.println("Error aya "+e.getMessage());
			
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("Display metadata.");
			archiveDocumentService.viewAll().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		/*
		try {
			System.out.println("Delete by id");
			archiveDocumentService.deleteById(3l);
			System.out.println("datele successfull");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
	}

}
