package com.lifan.qrcode;

import java.awt.image.BufferedImage;

import jp.sourceforge.qrcode.data.QRCodeImage;

public class MYQRCodeImage implements QRCodeImage {
	
	BufferedImage bufferedImage;
	
	public MYQRCodeImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}
	
	@Override
	public int getHeight() {
		return bufferedImage.getHeight();
	}

	@Override
	public int getPixel(int a, int b) {
		return bufferedImage.getRGB(a, b);
	}

	@Override
	public int getWidth() {
		return bufferedImage.getWidth();
	}

}
