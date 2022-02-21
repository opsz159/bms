package com.bms.admin.goods.service;

import java.util.List;
import java.util.Map;

import com.bms.goods.dto.GoodsDto;

public interface AdminGoodsService {
	
	public List<GoodsDto> listNewGoods() throws Exception;
	public void addNewGoods(GoodsDto goodsDto) throws Exception;
	public GoodsDto goodsDetail(int goodsId) throws Exception;
	public void modifyGoodsInfo(Map<String,Object> goodsMap) throws Exception;
	
}
