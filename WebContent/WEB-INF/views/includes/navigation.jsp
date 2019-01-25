<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<div id="navigation">
			<ul>
			<c:choose>
				<c:when test = '${prarm.menu == "main" }'>
					<li class="selected"><a href="${pageContext.servletContext.contextPath }">정우현</a></li>
					<li><a href="${pageContext.servletContext.contextPath }/guestbook">방명록</a></li>
					<li><a href="${pageContext.servletContext.contextPath }/board">게시판</a></li>
				</c:when>
				
				<c:when test = '${prarm.menu == "guestbook" }'>
					<li><a href="${pageContext.servletContext.contextPath }">정우현</a></li>
					<li class="selected"><a href="${pageContext.servletContext.contextPath }/guestbook">방명록</a></li>
					<li><a href="${pageContext.servletContext.contextPath }/board">게시판</a></li>
				</c:when>
				
				<c:when test = '${prarm.menu == "board" }'>
					<li><a href="${pageContext.servletContext.contextPath }">정우현</a></li>
					<li><a href="${pageContext.servletContext.contextPath }/guestbook">방명록</a></li>
					<li class="selected"><a href="${pageContext.servletContext.contextPath }/board">게시판</a></li>
				</c:when>
				
				<c:otherwise>
						<li><a href="${pageContext.servletContext.contextPath }">안대혁</a></li>
						<li><a href="${pageContext.servletContext.contextPath }/guestbook">방명록</a></li>
						<li><a href="${pageContext.servletContext.contextPath }/board">게시판</a></li>
					</c:otherwise>
			</c:choose>
			
			</ul>
		</div>