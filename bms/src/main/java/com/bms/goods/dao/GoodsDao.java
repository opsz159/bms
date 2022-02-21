package com.bms.goods.dao;

import java.util.List;

import com.bms.goods.dto.GoodsDto;

public interface GoodsDao {
	
	public List<GoodsDto> selectGoodsList(String goodsStatus) throws Exception;
	public GoodsDto selectGoodsDetail(int goodsId) throws Exception;

}
