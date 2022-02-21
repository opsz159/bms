package com.bms.goods.service;

import java.util.List;

import com.bms.goods.dto.GoodsDto;

public interface GoodsService {
	
	public List<GoodsDto> listGoods(String goodsStatus) throws Exception;
	public GoodsDto goodsDetail(int goodsId) throws Exception;
	
}
