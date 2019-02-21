package com.douzone.mysite.action.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.douzone.mvc.action.Action;
import com.douzone.mvc.util.WebUtils;
import com.douzone.mysite.repository.BoardDao;

public class ModifyFormAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse respnonse)
			throws IOException, ServletException {

		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String no = request.getParameter("no");

		new BoardDao().update(Long.parseLong(no), title, content);

		WebUtils.redirect(request, respnonse, request.getContextPath() + "/board?a=list");

	}
}
