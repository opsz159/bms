package com.bms.member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bms.member.dto.MemberDto;
import com.bms.member.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> loginMap, HttpServletRequest request) throws Exception {
			
		ModelAndView mv = new ModelAndView();
		
		MemberDto memberDto = memberService.login(loginMap);		
		
		if (memberDto != null) { 	
			HttpSession session = request.getSession();		
			session.setAttribute("isLogOn" , true);			
			session.setAttribute("memberInfo" , memberDto.getMemberId());
			session.setMaxInactiveInterval(60 * 30);
			mv.setViewName("redirect:/main/main");	
		}
		else { 
			mv.addObject("invalidMember", true);
			mv.setViewName("/member/loginForm");
		}
		return mv;
		
	}
	
	
	@RequestMapping(value="/logout" , method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		
		session.setAttribute("isLogOn", false);
		session.invalidate(); 
		
		mv.setViewName("redirect:/main/main");
		
		return mv;
	
	}
	
	
	@RequestMapping(value="/addMember" , method = RequestMethod.POST)
	public ResponseEntity<String> addMember(MemberDto memberDto , HttpServletRequest request) throws Exception {
		
		if (memberDto.getEmailstsYn() == null)  memberDto.setEmailstsYn("N");
		if (memberDto.getSmsstsYn() == null)    memberDto.setSmsstsYn("N");
		
		memberDto.setMemberPw(passwordEncoder.encode(memberDto.getMemberPw()));
		
		memberService.addMember(memberDto);

		String message  = "<script>";
			   message += " alert('회원가입되었습니다.');";
			   message += " location.href='" + request.getContextPath() + "/member/loginForm';";
			   message += " </script>";
	    
	    HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		
		return new ResponseEntity<String>(message, responseHeaders, HttpStatus.OK);
		
	}
	
	
	@RequestMapping(value="/overlapped" , method = RequestMethod.GET)
	public ResponseEntity<String> overlapped(@RequestParam("memberId") String memberId) throws Exception{
		return new ResponseEntity<String>(memberService.overlapped(memberId), HttpStatus.OK);
	}

	
	@RequestMapping(value="/loginForm" , method = RequestMethod.GET)
	public ModelAndView loginForm() throws Exception {
		return new ModelAndView("/member/loginForm");
	}

	
	@RequestMapping(value="/memberForm" , method = RequestMethod.GET)
	public ModelAndView memberForm() throws Exception {
		return new ModelAndView("/member/memberForm");
	}
	
	@RequestMapping(value = "/myPage" , method = RequestMethod.GET)
	public ModelAndView myPage(HttpServletRequest request , Model model) throws Exception {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("/member/myPage");
		
		HttpSession session = request.getSession();
		mv.addObject("memberDto" , memberService.showOneMember((String)session.getAttribute("memberInfo")));
		
		return mv;
		
	}	
	
	@RequestMapping(value="/update" , method = RequestMethod.POST)
	public ResponseEntity<Object> updateMemberInfo(@RequestParam("memberId") String memberId , 
												@RequestParam("modType") String modType , 
												@RequestParam("value") String value)  throws Exception{

		Map<String,String> memberMap = new HashMap<String,String>();
		String val[]     = null;

		if (modType.equals("memberPw")) {
			memberMap.put("memberPw" , passwordEncoder.encode(value));
		}
		else if (modType.equals("memberName")) {
			memberMap.put("memberName" , value);
		}
		else if (modType.equals("memberGender")) {
			memberMap.put("memberGender" , value);
		}
		else if (modType.equals("memberBirth")){
			val = value.split(",");
			memberMap.put("memberBirthY" , val[0]);
			memberMap.put("memberBirthM" , val[1]);
			memberMap.put("memberBirthD"  , val[2]);
			memberMap.put("memberBirthGn" , val[3]);
		}
		else if (modType.equals("tel")){
			val=value.split(",");
			memberMap.put("tel1",val[0]);
			memberMap.put("tel2",val[1]);
			memberMap.put("tel3",val[2]);
		}
		else if (modType.equals("hp")){
			val = value.split(",");
			memberMap.put("hp1"      , val[0]);
			memberMap.put("hp2"      , val[1]);
			memberMap.put("hp3"      , val[2]);
			memberMap.put("smsstsYn" , val[3]);
		}
		else if (modType.equals("email")){
			val = value.split(",");
			memberMap.put("email1"     , val[0]);
			memberMap.put("email2"     , val[1]);
			memberMap.put("emailstsYn" , val[2]);
		}
		else if (modType.equals("address")){
			val = value.split(",");
			memberMap.put("zipcode"       , val[0]);
			memberMap.put("roadAddress"   , val[1]);
			memberMap.put("jibunAddress"  , val[2]);
			memberMap.put("namujiAddress" , val[3]);
		}

		memberMap.put("memberId", memberId);

		memberService.updateMemberInfo(memberMap);
		return new ResponseEntity<Object>(HttpStatus.OK);

	}
	
	@RequestMapping(value="/showOneMember" , method=RequestMethod.GET)
	public ModelAndView showOneMember(@RequestParam("memberId") String memberId)  throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/member/showOneMember");
		mv.addObject("memberPage" , memberService.showOneMember(memberId));
		
		return mv;
		
	}
}
