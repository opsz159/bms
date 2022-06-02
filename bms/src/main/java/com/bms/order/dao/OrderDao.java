package com.bms.order.dao;

import java.util.List;
import java.util.Map;

import com.bms.goods.dto.GoodsDto;
import com.bms.member.dto.MemberDto;
import com.bms.order.dto.OrderDto;

public interface OrderDao {
	
	public void insertNewOrder(OrderDto orderDto) throws Exception;
	public List<OrderDto> selectOrderMemberInfo(String memberId) throws Exception;
	public GoodsDto selectGoodsInfo(int goodsId) throws Exception;
	public List<OrderDto> selectOrderList() throws Exception;
	public Map<String, Object> selectOrderInfo(int orderId) throws Exception;
	public MemberDto selectOrdererInfo(String memberId) throws Exception;
	
}
