package com.deluxHotel.DeluxHotelMS;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.deluxHotel.DeluxHotelMS.application")
public class DeluxHotelMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeluxHotelMsApplication.class, args);
	}

}
