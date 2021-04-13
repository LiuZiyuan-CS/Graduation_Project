package com.deluxHotel.DeluxHotelMS.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 生成拦截器
		LoginInterceptor LoginInterceptor = new LoginInterceptor();
		// 将拦截器注册
		InterceptorRegistration LoginRegistry = registry.addInterceptor(LoginInterceptor);
		// 添加拦截路径
		LoginRegistry.addPathPatterns("/back/**.html");
		// 排除路径
		LoginRegistry.excludePathPatterns("/back/sign-in.html");
		
		
		// 排除资源请求
		//objLoginRegistry.excludePathPatterns("/back/**");

		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
