package com.bms.order.service;

import java.util.List;
import java.util.Map;

import com.bms.goods.dto.GoodsDto;
import com.bms.member.dto.MemberDto;
import com.bms.order.dto.OrderDto;

public interface OrderService {
	
	public void addNewOrder(OrderDto orderDto) throws Exception;
	public MemberDto getOrdererInfo(String memberId) throws Exception;
	public GoodsDto getGoodsInfo(int goodsId) throws Exception;
	public List<OrderDto> getOrderList() throws Exception;
	public Map<String, Object> orderInfo(int orderId) throws Exception;
	
}
