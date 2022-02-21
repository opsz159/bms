package com.bms.member.service;

import java.util.Map;

import com.bms.member.dto.MemberDto;

public interface MemberService {
	
	public MemberDto login(Map<String,String> loginMap) throws Exception;
	public void addMember(MemberDto memberDto) throws Exception;
	public String overlapped(String memberId) throws Exception;
	public MemberDto showOneMember(String memberId) throws Exception;
	public void updateMemberInfo(Map<String, String> memberMap) throws Exception;

}
