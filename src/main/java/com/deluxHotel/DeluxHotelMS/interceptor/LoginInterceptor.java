package com.deluxHotel.DeluxHotelMS.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*
		 * if(strUrl.endsWith("login.html") ) { return true; }
		 */
		
		Object loginStaff = request.getSession().getAttribute("loginStaff");
		if(loginStaff != null) {
			return true;
		}else {
			response.sendRedirect("sign-in.html");
			return false;
		}
		/*
		 * try { // 统一拦截（查询当前session是否存在user）(这里user会在每次登陆成功后，写入session) Staff objStaff
		 * = (Staff) request.getSession().getAttribute("username"); if (objStaff !=
		 * null) { return true; } response.sendRedirect(request.getContextPath() +
		 * "back/login.html"); } catch (IOException e) { e.printStackTrace(); }
		 */
		//return false;// 如果设置为false时，被请求时，拦截器执行到此处将不会继续操作
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
