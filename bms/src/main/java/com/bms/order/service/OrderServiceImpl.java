package com.bms.order.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.goods.dto.GoodsDto;
import com.bms.member.dto.MemberDto;
import com.bms.order.dao.OrderDao;
import com.bms.order.dto.OrderDto;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDao orderDao;
	
	public void addNewOrder(OrderDto orderDto) throws Exception{
		orderDao.insertNewOrder(orderDto);
	}

	@Override
	public List<OrderDto> getOrderMemberInfo(String memberId) throws Exception {
		return orderDao.selectOrderMemberInfo(memberId);
	}
	
	@Override
	public MemberDto getOrdererInfo(String memberId) throws Exception {
		return orderDao.selectOrdererInfo(memberId);
	}

	@Override
	public GoodsDto getGoodsInfo(int goodsId) throws Exception{
		return orderDao.selectGoodsInfo(goodsId);
	}	
	
	@Override
	public List<OrderDto> getOrderList() throws Exception{ 
		return orderDao.selectOrderList();
	}
	
	@Override
	public Map<String,Object> orderInfo(int orderId) throws Exception{
		return orderDao.selectOrderInfo(orderId);
	}
	
}
