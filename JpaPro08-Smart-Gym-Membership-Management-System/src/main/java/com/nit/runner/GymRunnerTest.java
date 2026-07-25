package com.nit.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.GymMember;
import com.nit.service.IGymMemberService;
@Component
public class GymRunnerTest implements CommandLineRunner {

	@Autowired
	private IGymMemberService gymMemberService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("""
						 \nSmart Gym Membership Management System\n
						1. Register a gym member using save().
						2. Register multiple members using saveAll().
						3. Display all members using findAll().
						4. Search member details using findById().
						5. Check member availability using existsById().
						6. Count registered members using count().
						7. Update membership fees using save().
						8. Delete a member using deleteById().
						9. Delete all members using deleteAll().
						10.Exit
						\nchoice option

						""");
				int choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1->{
					System.out.println("Register a gym member using save()");
					System.out.print("Enter Gym memberName :: ");
					String name = sc.nextLine();
					
					System.out.print("Enter Gym membershipType :: ");
					String membershipType = sc.nextLine();
					
					System.out.print("Enter Gym membershipDuration :: ");
					int membershipDuration = Integer.parseInt(sc.nextLine());
					
					System.out.print("Enter Gym fees :: ");
					double fees = Double.parseDouble(sc.nextLine());
					
					//create GymMember object to insert data
					GymMember insertGymMember = new GymMember();
					insertGymMember.setMemberName(name);
					insertGymMember.setMembershipType(membershipType);
					insertGymMember.setMembershipDuration(membershipDuration);
					insertGymMember.setFees(fees);
					
					//invoke service methods
					gymMemberService.addMember(insertGymMember);
					System.out.println("member insert successfull..");
				}
				case 2->{
					System.out.println("Register multiple members using saveAll().");
					List<GymMember> list = new ArrayList<>();
					System.out.println("how many member add you");
					int numberOfGymMember = Integer.parseInt(sc.nextLine());
					for(int i=1;i<=numberOfGymMember;i++) {
						System.out.println("Member "+i);
						System.out.print("Enter Gym memberName :: ");
						String name = sc.nextLine();
						
						System.out.print("Enter Gym membershipType :: ");
						String membershipType = sc.nextLine();
						
						System.out.print("Enter Gym membershipDuration :: ");
						int membershipDuration = Integer.parseInt(sc.nextLine());
						
						System.out.print("Enter Gym fees :: ");
						double fees = Double.parseDouble(sc.nextLine());
						
						//create GymMember object to insert data
						GymMember insertGymMember = new GymMember();
						insertGymMember.setMemberName(name);
						insertGymMember.setMembershipType(membershipType);
						insertGymMember.setMembershipDuration(membershipDuration);
						insertGymMember.setFees(fees);
						//insert data in list and set data
						list.add(insertGymMember);
					}
					//invoke service methods
					gymMemberService.addAllMembers(list);
					System.out.println("member add successfull..");
				}
				case 3 ->{
					System.out.println("Display all members using findAll().");
					gymMemberService.getAllMembers().forEach(System.out::println);
				}
				case 4 ->{
					System.out.println("Search member details using findById().");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					if(gymMemberService.memberExists(id)) {
						
						System.out.println("gym -> "+gymMemberService.getMemberById(id));
					}else {
						System.out.println("no member ther by id "+id );
					}
				}
				case 5 ->{
					System.out.println("Check member availability using existsById().");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					System.out.println("gym member -> "+gymMemberService.memberExists(id));
				}
				case 6 ->{
					System.out.println("Count registered members using count().");
					System.out.println("total gymMember -> "+gymMemberService.totalMembers());
				}
				case 7 ->{
					System.out.println("Update membership fees using save().");
					
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					
					System.out.print("Enter Gym memberName :: ");
					String name = sc.nextLine();
					
					System.out.print("Enter Gym membershipType :: ");
					String membershipType = sc.nextLine();
					
					System.out.print("Enter Gym membershipDuration :: ");
					int membershipDuration = Integer.parseInt(sc.nextLine());
					
					System.out.print("Enter Gym fees :: ");
					double fees = Double.parseDouble(sc.nextLine());
					
					//create GymMember object to update data
					GymMember updateGymMember = new GymMember();
					updateGymMember.setMemberId(id);
					updateGymMember.setMemberName(name);
					updateGymMember.setMembershipType(membershipType);
					updateGymMember.setMembershipDuration(membershipDuration);
					updateGymMember.setFees(fees);
					
					//invoke service methods
					gymMemberService.updateMember(updateGymMember);
					System.out.println("update sucessfull...");
				}
				case 8->{
					System.out.println("Delete a member using deleteById()");
					System.out.print("Enter id ");
					long id = Long.parseLong(sc.nextLine());
					if(gymMemberService.memberExists(id)) {
						
						gymMemberService.removeMember(id);
						System.out.println("delete by id ");
					}else {
						System.out.println("not found member id "+id);
					}
				}
				case 9 ->{
					System.out.println("Delete all members using deleteAll()");
					gymMemberService.removeAllMembers();
					System.out.println("delete all member successfull..");
				}
				case 10->{
					System.out.println("thank you! vist again..");
					System.exit(0);
				}
				default ->{
					System.out.println("invaild choice! please choice nubmer 1 to 10.");
				}
				}//switch case end
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("error "+e.getMessage());
			}//try-catch end
			
		}//while end

	}//run end

}
