package com.deluxHotel.DeluxHotelMS.utils;

import java.io.IOException;

import org.springframework.stereotype.Component;

import net.coobird.thumbnailator.Thumbnails;
@Component
public class ThumbnailatorUtil {
	public void changeImgSize(String originalAddress,String newAddress) throws IOException {
		Thumbnails.of(originalAddress).forceSize(100,100).toFile(newAddress);
		System.out.println("压缩成功");
	}
}
