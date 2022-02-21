package com.bms.goods.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.goods.dto.GoodsDto;

@Repository
public class GoodsDaoImpl implements GoodsDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<GoodsDto> selectGoodsList(String goodsStatus) throws Exception {
	   return sqlSession.selectList("mapper.goods.selectGoodsList" , goodsStatus);	
	}
	
	@Override
	public GoodsDto selectGoodsDetail(int goodsId) throws Exception{
		return sqlSession.selectOne("mapper.goods.selectGoodsDetail" , goodsId);
	}
	
}
