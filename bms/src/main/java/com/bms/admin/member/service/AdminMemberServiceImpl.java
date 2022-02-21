package com.bms.admin.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.admin.member.dao.AdminMemberDao;
import com.bms.member.dto.MemberDto;

@Service
public class AdminMemberServiceImpl implements AdminMemberService {
	
	@Autowired
	private AdminMemberDao adminMemberDao;
	
	public List<MemberDto> listMember() throws Exception{
		return adminMemberDao.listMember();
	}
	
	public MemberDto memberDetail(String memberId) throws Exception{
		 return adminMemberDao.memberDetail(memberId);
	}
	
	public void modifyMemberInfo(Map<String,String> memberMap) throws Exception{
		 adminMemberDao.modifyMemberInfo(memberMap);
	}
	
}
