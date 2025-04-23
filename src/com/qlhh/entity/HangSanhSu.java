package com.qlhh.entity;

public class HangSanhSu extends HangHoa{
	private String nhaSanXuat;
	private int ngayNhapKho;
	public HangSanhSu() {
		
	}

	public HangSanhSu(int maHang, String tenHang, int soLuong, double donGia, String nhaSanXuat, int ngayNhapKho) {
		super(maHang, tenHang, soLuong, donGia);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	
	@Override
	public double tinhVAT() {
		return getdonGia()*0.1;
	}
}