package com.bms.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bms.goods.dto.GoodsDto;
import com.bms.goods.service.GoodsService;

@Controller
public class MainController {
	
	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public ModelAndView home() throws Exception{
		return new ModelAndView("redirect:/main/main");
	}
	
	
	@RequestMapping(value="/main/main" , method=RequestMethod.GET)
	public ModelAndView main(HttpServletRequest request) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/main/main");
		
		HttpSession session = request.getSession();
		session.setAttribute("sideMenu", "user");
		
		List<GoodsDto> bestseller   = goodsService.listGoods("bestseller");
		List<GoodsDto> newbook      = goodsService.listGoods("newbook");
		List<GoodsDto> steadyseller = goodsService.listGoods("steadyseller");
		
		mv.addObject("bestseller" , bestseller);
		mv.addObject("newbook" , newbook);
		mv.addObject("steadyseller" , steadyseller);
		
		return mv;
		
	}
	
}
