package com.lifan.zxing;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

//生成二维码
public class CreateQRCode {

	public static void main(String[] args) {
		
		int width = 300;
		int height = 300;
		String format = "png";
		String content = "陈思茹你好可爱";
		//定义二维码的参数
		HashMap hints = new HashMap();
		//编码格式
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		//纠错等级
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
		//边距
		hints.put(EncodeHintType.MARGIN, 2);
		
		//生成二维码
		try {
			
			BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);		
			File file = new File("D:/code/img.png");	
			MatrixToImageWriter.writeToFile(bitMatrix, format, file);
			
			System.out.println("成功生成二维码");
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
