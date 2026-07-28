package com.nit.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.VehicleInsurance;
import com.nit.service.IVehicleInsuranceService;
@Component
public class DigitalVehicleInsuranceManagementRunner implements CommandLineRunner {

	@Autowired
	private IVehicleInsuranceService insuranceService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("""
						\n Digital Vehicle Insurance Management System\n
						1. Add a vehicle insurance policy using save().
						2. Add multiple insurance policies using saveAll().
						3. Display all policies using findAll().
						4. Search policy by ID using findById().
						5. Check policy existence using existsById().
						6. Count total policies using count().
						7. Update premium amount using save().
						8. Delete a policy using deleteById().
						9. Delete all policies using deleteAll().
						10.Exit Application
						\n Choice option
						""");
				int choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1->{
					System.out.println("Add a vehicle insurance policy using save().");
					System.out.print("Enter vehicleNumber: ");
					String vehicleNumber = sc.nextLine();
					
					System.out.print("Enter ownerName: ");
					String ownerName = sc.nextLine();
					
					System.out.print("Enter insuranceCompany: ");
					String insuranceCompany = sc.nextLine();
					
					System.out.print("Enter premiumAmount: ");
					double premiumAmount = Double.parseDouble(sc.nextLine());
					
					//create object to set values
					
					VehicleInsurance insertInsurance = new VehicleInsurance();
					insertInsurance.setVehicleNumber(vehicleNumber);
					insertInsurance.setOwnerName(ownerName);
					insertInsurance.setInsuranceCompany(insuranceCompany);
					insertInsurance.setPremiumAmount(premiumAmount);
					
					//invoke method 
					insuranceService.addPolicy(insertInsurance);
					System.out.println("policy add successfull..");
				}
				case 2 ->{
					System.out.println("Add multiple insurance policies using saveAll().");
					List<VehicleInsurance> list=new ArrayList<>();
					System.out.println("How many policy add you");
					int numberOfPolicy = Integer.parseInt(sc.nextLine());
					for(int i=1;i<=numberOfPolicy;i++) {
						System.out.println("policy "+i);
						System.out.print("Enter vehicleNumber: ");
						String vehicleNumber = sc.nextLine();
						
						System.out.print("Enter ownerName: ");
						String ownerName = sc.nextLine();
						
						System.out.print("Enter insuranceCompany: ");
						String insuranceCompany = sc.nextLine();
						
						System.out.print("Enter premiumAmount: ");
						double premiumAmount = Double.parseDouble(sc.nextLine());
						
						//create object to set values
						
						VehicleInsurance insertInsurance = new VehicleInsurance();
						insertInsurance.setVehicleNumber(vehicleNumber);
						insertInsurance.setOwnerName(ownerName);
						insertInsurance.setInsuranceCompany(insuranceCompany);
						insertInsurance.setPremiumAmount(premiumAmount);
						
						 //set values by list
						list.add(insertInsurance);
					}
					//invoke method
					insuranceService.addMultiplePolicies(list);
					System.out.println("policy add successfull..");
					
				}
				case 3 ->{
					System.out.println("Display all policies using findAll()");
					insuranceService.getAllPolicies().forEach(System.out::println);
				}
				case 4->{
					System.out.println("Search policy by ID using findById()");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					if(insuranceService.policyExists(id)) {
						System.out.println(insuranceService.getPolicyById(id));
						System.out.println("Policy id found it "+id);
					}
					else {
						System.out.println("Policy not id found it "+id);
					}
					
				}
				case 5->{
					System.out.println("Check policy existence using existsById().");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					System.out.println("policy -> "+insuranceService.policyExists(id));
				}
				case 6 ->{
					System.out.println("Count total policies using count().");
					System.out.println("Total policy are -> "+insuranceService.countPolicies());
				}
				case 7 ->{
					System.out.println("Update premium amount using save().");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					
					System.out.print("Enter vehicleNumber: ");
					String vehicleNumber = sc.nextLine();
					
					System.out.print("Enter ownerName: ");
					String ownerName = sc.nextLine();
					
					System.out.print("Enter insuranceCompany: ");
					String insuranceCompany = sc.nextLine();
					
					System.out.print("Enter premiumAmount: ");
					double premiumAmount = Double.parseDouble(sc.nextLine());
					
					//create object to set values
					
					VehicleInsurance updateInsurance = new VehicleInsurance();
					updateInsurance.setInsuranceId(id);
					updateInsurance.setVehicleNumber(vehicleNumber);
					updateInsurance.setOwnerName(ownerName);
					updateInsurance.setInsuranceCompany(insuranceCompany);
					updateInsurance.setPremiumAmount(premiumAmount);
					
					//invoke method 
					insuranceService.updatePolicy(updateInsurance);
					System.out.println("Update successfull..");
				}
				case 8 ->{
					System.out.println("Delete a policy using deleteById().");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					if(insuranceService.policyExists(id)) {
						insuranceService.deletePolicy(id);
						System.out.println("Policy delete by Id Successfull "+id);
					}else {
						System.out.println("Policy not fund by id "+id);
					}
				}
				case 9->{
					System.out.println("Delete all policy using deleteAll().");
					insuranceService.deleteAllPolicies();
					System.out.println("Delete all policy successfull ");
				}
				case 10->{
					System.out.println("Thank you! using our Applicatopn...");
					System.exit(0);
				}
				default->{
					System.out.println("Invalid choice ! please select 1 to 10 number only");
				}
				}
				
			} catch (Exception e) {
				System.out.println("Error "+e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
