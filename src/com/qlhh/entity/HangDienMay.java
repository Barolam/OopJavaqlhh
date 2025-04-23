package com.qlhh.entity;

public class HangDienMay extends HangHoa{
	private int thoiGianBH;
	private int congSuat;
	public HangDienMay() {
		
	}

	public HangDienMay(int maHang, String tenHang, int soLuong, double donGia, int thoiGianBH, int congSuat) {
		super(maHang, tenHang, soLuong, donGia);
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}
	
	@Override
	public double tinhVAT() {
		return getdonGia()*0.1;
	
	}
}
