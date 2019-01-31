package com.douzone.mysite.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;

public class ReplyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpServletResponse respnonse = null;
		request.setAttribute("no", request.getParameter("no"));
		WebUtils.forward(request, respnonse, "/WEB-INF/views/board/reply.jsp");
	}

}
