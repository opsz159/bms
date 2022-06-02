package com.bms.goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bms.goods.service.GoodsService;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping(value="/goodsDetail" , method = RequestMethod.GET)
	public ModelAndView goodsDetail(@RequestParam("goodsId") int goodsId) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/goods/goodsDetail");
		mv.addObject("goods", goodsService.goodsDetail(goodsId));
		
		return mv;
		
	}
	
}
