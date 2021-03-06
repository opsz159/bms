package com.bms.member.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.member.dto.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSession sqlSession;	
	
	@Override
	public MemberDto login(Map<String,String> loginMap) throws Exception{
	   return sqlSession.selectOne("mapper.member.login" , loginMap);
	}
	
	@Override
	public void insertNewMember(MemberDto memberDto) throws Exception{
		sqlSession.insert("mapper.member.insertNewMember" , memberDto);
	}

	@Override
	public int selectOverlappedID(String memberId) throws Exception{
		return sqlSession.selectOne("mapper.member.selectOverlappedId" , memberId);
	}
	
	@Override
	public MemberDto selectOneMember(String memberId) throws Exception {
		return sqlSession.selectOne("mapper.member.showOneMember" , memberId);
	}
	
	@Override
	public void updateMemberInfo(Map<String,String> memberMap) throws Exception{
		sqlSession.update("mapper.member.updateMemberInfo" , memberMap);
	}
	
	@Override
	public void deleteMember(String memberId) throws Exception {
		sqlSession.delete("mapper.member.deleteMember", memberId);
	}

	@Override
	public List<MemberDto> findId(String memberName) throws Exception {
		return sqlSession.selectList("mapper.member.findId" , memberName);
	}
	
	@Override
	public int findIdCheck(String memberName) throws Exception {
		return sqlSession.selectOne("mapper.member.findIdCheck" , memberName);
	}
}
