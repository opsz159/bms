package com.bms.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.goods.dao.GoodsDao;
import com.bms.goods.dto.GoodsDto;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsDao goodsDao;
	
	public List<GoodsDto> listGoods(String goodsStatus) throws Exception {
		return goodsDao.selectGoodsList(goodsStatus);
	}
	
	
	public GoodsDto goodsDetail(int goodsId) throws Exception {
		return goodsDao.selectGoodsDetail(goodsId);
	}
	
	
}
