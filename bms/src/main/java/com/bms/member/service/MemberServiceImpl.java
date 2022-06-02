package com.bms.member.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	
	@Override
	public boolean deleteMember(Map<String,String> loginMap) throws Exception{
		
		System.out.println(loginMap);
		MemberDto memberDto = memberDao.login(loginMap);
		System.out.println("sv : " + memberDto);
		if (memberDto != null) {
			if (passwordEncoder.matches(loginMap.get("memberPw") , memberDto.getMemberPw())) {
				memberDao.deleteMember(memberDto.getMemberId());
				return true;
			}
		}
		return false;
	}
	
	@Override
	public List<MemberDto> findId(String memberName) throws Exception {
		return memberDao.findId(memberName);
	}
	
	@Override
	public int findIdCheck(String memberName) throws Exception {
		return memberDao.findIdCheck(memberName);
	}
}
