package com.bms.order.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bms.goods.dto.GoodsDto;
import com.bms.member.dto.MemberDto;
import com.bms.order.dto.OrderDto;

@Repository
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public void insertNewOrder(OrderDto orderDto) throws Exception{
		sqlSession.insert("mapper.order.insertNewOrder" , orderDto);
	}

	@Override
	public MemberDto selectOrdererInfo(String memberId) throws Exception {
		return sqlSession.selectOne("mapper.order.selectOrdererInfo" , memberId);
	}

	@Override
	public GoodsDto selectGoodsInfo(int goodsId) throws Exception {
		return sqlSession.selectOne("mapper.order.selectGoodsInfo" , goodsId);
	}

	public List<OrderDto> selectOrderList() throws Exception{
		return sqlSession.selectList("mapper.order.selectOrderList");
	}
	
	@Override
	public Map<String,Object> selectOrderState(int orderId) throws Exception{
		return sqlSession.selectOne("mapper.order.selectOrderState" , orderId);
	}
}

