package com.bms.member.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bms.member.dao.MemberDao;
import com.bms.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	public MemberDto login(Map<String,String> loginMap) throws Exception{
		
		MemberDto memberDto = memberDao.login(loginMap);

		if (memberDto != null) {
			if (passwordEncoder.matches(loginMap.get("memberPw") , memberDto.getMemberPw())) {
				return memberDto;
			}
		}
		
		return null;
		
	}
	
	
	@Override
	public void addMember(MemberDto memberDto) throws Exception{
		memberDao.insertNewMember(memberDto);
	}
	
	
	@Override
	public String overlapped(String memberId) throws Exception{
		
		if (memberDao.selectOverlappedID(memberId) == 1)	return "true";
		else												return "false";
			
	}
	
	@Override
	public MemberDto showOneMember(String memberId) throws Exception {
		return memberDao.selectOneMember(memberId);
	}
	
	@Override
	public void updateMemberInfo(Map<String,String> memberMap) throws Exception{
		 memberDao.updateMemberInfo(memberMap);
	}
	
}
