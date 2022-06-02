package com.bms.member.dao;

import java.util.List;
import java.util.Map;

import com.bms.member.dto.MemberDto;

public interface MemberDao {
	
	public MemberDto login(Map<String,String> loginMap) throws Exception;
	public void insertNewMember(MemberDto memberDto) throws Exception;
	public int selectOverlappedID(String memberId) throws Exception;
	public MemberDto selectOneMember(String memberId) throws Exception;
	public void updateMemberInfo(Map<String, String> memberMap) throws Exception;
	public void deleteMember(String memberId) throws Exception;
	public List<MemberDto> findId(String memberName) throws Exception;
	public int findIdCheck(String memberName) throws Exception;

}
