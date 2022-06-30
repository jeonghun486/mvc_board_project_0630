package com.hoon.board.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hoon.board.dao.copy.BDao;
import com.hoon.board.dto.BDto;

public class BListCommand {

	public void listExcute(HttpServletRequest request, HttpServletResponse response) {
		BDao bdao = new BDao();
		ArrayList<BDto> bdtos = bdao.list();
		
		request.setAttribute("list", bdtos);
		//request 객체에 "list"란 이름으로 ArrayList 자료 구조인 bdtos를 셋팅
		//자료가 셋팅된 request 객체가 그대로 컨트롤러에 전달
		
	}
	
}
