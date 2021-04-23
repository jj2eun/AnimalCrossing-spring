package com.first.member.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.first.member.dto.MemberDto;
import com.first.member.service.MemberService;

@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Resource(name = "memberServiceImpl")
	MemberService memberService;
	
	// �α���
	@RequestMapping(value = "/member/login.do", method = RequestMethod.GET)
	public String login(HttpServletRequest request, HttpServletResponse response) {
		return "/member/login"; 
	}
	
	// �α��� �Ϸ�
	@RequestMapping(value="/member/loginOk.do", method=RequestMethod.POST)
	public String loginOk(HttpSession session, Model model, HttpServletRequest request, MemberDto memberDto) {
		// �α��� ���񽺷� �̵�
		logger.info("loginOk");
		int check = memberService.login(memberDto);
		model.addAttribute("check", check);
		if(check==1) {
			session.setAttribute("login", memberDto.getUserId());
			return "redirect:/";  // �ڵ����� index.jsp ������ ã�Ƽ� ��������ش�
		} else {
			return "login";
		}
	}
	// �α׾ƿ�
	@RequestMapping(value="/member/logout.do", method=RequestMethod.GET)
	public String logout(HttpSession session, Model model) {
		if(session.getAttribute("login") != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	
	// ȸ������
	@RequestMapping(value="/member/register.do", method = RequestMethod.GET)
	public String register(HttpServletRequest request, HttpServletResponse response) {
		logger.info("register");
		return "/member/register";
	}

	// ȸ������ �Ϸ�
	@RequestMapping(value="/member/registerOk.do", method = RequestMethod.POST)
	public String registerOk(HttpServletRequest request, HttpServletResponse response, MemberDto memberDto) {
		// ���񽺷� �̵�
		logger.info("registerOk");
		int check = memberService.register(memberDto);
		request.setAttribute("check", check);
		return "/member/loginOk";
	}
}
