package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.GymMember;
import com.nit.repository.GymMemberRepository;
@Service
public class GymMemberService implements IGymMemberService {

	@Autowired
	private GymMemberRepository gymMemberRepository;
	@Override
	public void addMember(GymMember member) {
		// TODO Auto-generated method stub
		gymMemberRepository.save(member);
	}

	@Override
	public List<GymMember> addAllMembers(List<GymMember> members) {
		// TODO Auto-generated method stub
		return gymMemberRepository.saveAll(members);
	}

	@Override
	public GymMember getMemberById(Long id) {
		// TODO Auto-generated method stub
		return gymMemberRepository.findById(id).orElseThrow(() -> new RuntimeException("member  not found with id: " + id));
	}

	@Override
	public Iterable<GymMember> getAllMembers() {
		// TODO Auto-generated method stub
		return gymMemberRepository.findAll();
	}

	@Override
	public GymMember updateMember(GymMember member) {
		GymMember gymMember = gymMemberRepository.findById(member.getMemberId()).orElseThrow(()-> new RuntimeException("member not found"));
		
		gymMember.setMemberName(member.getMemberName());
		gymMember.setMembershipType(member.getMembershipType());
		gymMember.setMembershipDuration(member.getMembershipDuration());
		gymMember.setFees(member.getFees());
		
		return gymMemberRepository.save(gymMember);
	}

	@Override
	public void removeMember(Long id) {
		gymMemberRepository.deleteById(id);
	}

	@Override
	public void removeAllMembers() {
		gymMemberRepository.deleteAll();

	}

	@Override
	public long totalMembers() {
		// TODO Auto-generated method stub
		return gymMemberRepository.count();
	}

	@Override
	public boolean memberExists(Long id) {
		// TODO Auto-generated method stub
		return gymMemberRepository.existsById(id);
	}

}
