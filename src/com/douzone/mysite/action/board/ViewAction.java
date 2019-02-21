package com.douzone.mysite.action.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.BoardDao;
import com.douzone.mysite.vo.BoardVo;
public class ViewAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		HttpSession session = request.getSession();
		String no = request.getParameter("no");
		new BoardDao().update(Long.parseLong(no));
		
		List<BoardVo> list = new BoardDao().getList(Long.parseLong(no));
		
		HttpSession Session = request.getSession();
		
		request.setAttribute("list", list);
		request.setAttribute("session", session.getAttribute("authuser"));
		request.setAttribute("no", no);
		WebUtils.forward(request, response, "/WEB-INF/views/board/view.jsp");
	}
}
