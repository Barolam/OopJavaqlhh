package com.qlhh.entity;

public class HangDienMay extends HangHoa{
	private int thoiGianBH;
	private int congSuat;
	private HangHoa hangHoa;
	public HangDienMay() {
		
	}

	public HangDienMay(int maHang, String tenHang, int soLuong, double donGia, int thoiGianBH, int congSuat) {
		super(maHang, tenHang, soLuong, donGia);
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}
	
	@Override
	public double tinhVAT() {
		double VAT = 0;
		VAT = hangHoa.getdonGia()*0.1;
		return VAT;
	
	}
}
