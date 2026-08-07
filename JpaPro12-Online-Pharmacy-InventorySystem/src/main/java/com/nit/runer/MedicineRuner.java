package com.nit.runer;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Medicine;
import com.nit.repository.MedicineRepository;
@Component
public class MedicineRuner implements CommandLineRunner {

	@Autowired
	private MedicineRepository repository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		try {
			List<Medicine> list = List.of(
					new Medicine("Paracetamol 500mg", "Pain Relief", "Cipla",25.50 , 150, LocalDate.of(2027, 5, 20), 4.5),
					new Medicine("Azithromycin 250mg", "Antibiotic", "Sun Pharma", 120.8, 80, LocalDate.of(2027, 8, 15), 3.9),
					new Medicine("Cetirizine 10mg", "Allergy", "Dr. Reddy'", 45.00, 200, LocalDate.of(2027, 11, 10), 4.2),
				    new Medicine( "Omeprazole 20mg", "Gastro", "Torrent Pharma",
				            95.00, 120, LocalDate.of(2028, 1, 25), 4.4),

				    new Medicine( "Metformin 500mg", "Diabetes", "Lupin",
				            75.00, 180, LocalDate.of(2028, 3, 18), 4.6),

				    new Medicine( "Amlodipine 5mg", "Blood Pressure", "Zydus",
				            65.00, 90, LocalDate.of(2027, 9, 30), 4.1),

				    new Medicine( "Amoxicillin 500mg", "Antibiotic", "Mankind",
				            110.00, 70, LocalDate.of(2027, 12, 12), 4.3),

				    new Medicine( "Vitamin D3", "Supplement", "Abbott",
				            180.00, 140, LocalDate.of(2028, 6, 5), 4.7),

				    new Medicine( "Ibuprofen 400mg", "Pain Relief", "Glenmark",
				            55.00, 160, LocalDate.of(2027, 10, 22), 4.4),

				    new Medicine( "Pantoprazole 40mg", "Gastro", "Alkem",
				            130.00, 100, LocalDate.of(2028, 2, 14), 4.5)
					);
			if(repository.count()==0) {
				
				repository.saveAll(list);
			}
			System.out.println("save all");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
		/*try {
			System.out.println("1. Diabetes or ABC Lupin.");
			repository.findByCategoryOrManufacturer("Diabetes", "Lupin").forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
		/*try {
			System.out.println("2. Price 100-500.");
			repository.findByPriceBetween(100d,500d).forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
		/*try {
			System.out.println("3. Stock 50-200.");
			repository.findByStockQuantityBetween(50, 200).forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		/*
		try {
			
			System.out.println("4. Paracetamol or Pain Relief.");
			repository.findByMedicineNameOrCategory("Paracetamol", "Gastro").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("5. Expiry 2026-06-01 to 2026-12-31.");
			repository.findByExpiryDateBetween( LocalDate.parse("2027-09-30"), LocalDate.parse("2027-05-20") ).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		*/
		/*
		try {
			System.out.println(" 6. Rating 4.0-5.0.");
			repository.findByRatingBetween(4.0, 5.0).forEach(System.out::println);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
		*/
		/*
		try {
			
			System.out.println(" Cipla Ltd or Antibiotic.");
			repository.findByManufacturerOrCategory("Cipla ", "Pain Relief").forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		*/
		
		try {
			System.out.println("8. IDs 101-110");
			repository.findByMedicineIdBetween(101l, 110l).forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
