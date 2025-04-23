package com.qlhh.entity;

public class HangThucPham extends HangHoa{
	private int ngaySanXuat;
	private int ngayHetHan;
	private String nhaCungCap;
	public HangThucPham() {
		
	}

	public HangThucPham(int maHang, String tenHang, int soLuong, double donGia, int ngaySanXuat, int ngayHetHan, String nhaCungCap) {
		super(maHang, tenHang, soLuong, donGia);
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
		this.nhaCungCap = nhaCungCap;
	}
	
	@Override
	public double tinhVAT() {
		return getdonGia()*0.05;
	}
}
