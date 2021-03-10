package com.deluxHotel.DeluxHotelMS.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontIndexAction {
	@GetMapping("front/index.html")
	public String index() {
		return "front/index";
	}
	@GetMapping("front/signIn.html")
	public String signIn() {
		return "front/sign-in";
	}
}
