
package com.bms.admin.goods.dao;

import java.util.List;
import java.util.Map;

import com.bms.goods.dto.GoodsDto;

public interface AdminGoodsDao {
	
	public List<GoodsDto>selectNewGoodsList() throws Exception;
	public void insertNewGoods(GoodsDto goodsDto) throws Exception;
	public GoodsDto selectGoodsDetail(int goodsId) throws Exception;
	public void updateGoodsInfo(Map<String,Object> goodsMap) throws Exception;
	
}
