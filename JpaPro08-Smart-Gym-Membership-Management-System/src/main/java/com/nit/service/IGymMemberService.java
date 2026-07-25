package com.nit.service;

import java.util.List;

import com.nit.entity.GymMember;

public interface IGymMemberService {
	
	public void addMember(GymMember member);
	public List<GymMember> addAllMembers(List<GymMember> members);
	public GymMember getMemberById(Long id);
	public Iterable<GymMember> getAllMembers();
	public GymMember  updateMember(GymMember member);
	public void removeMember(Long id);
	public void  removeAllMembers();
	public long  totalMembers();
	public boolean memberExists(Long id);
}
