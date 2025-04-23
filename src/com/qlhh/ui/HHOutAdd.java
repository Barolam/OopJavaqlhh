package com.qlhh.ui;

import java.io.PrintWriter;

import com.qlhh.entity.HangHoa;

public class HHOutAdd {
	private PrintWriter out;
	
	public HHOutAdd() {
		
	}

	public HHOutAdd(PrintWriter out) {
		this.out = out;
	}
	
	public void showMessage(HangHoa hh) {
		out.println("Đã thêm thành công 1 Mat Hang!");
		out.flush();
		out.println("[Ma Hang]: " + hh.getmaHang());
		out.flush();
		out.println("[Ten Hang]: " + hh.gettenHang());
		out.flush();
		out.println("[So Luong]: " + hh.getsoLuong());
		out.flush();
		out.println("[Don Gia]: " + hh.getdonGia());
		out.flush();
		out.println("[VAT]: " + hh.tinhVAT());
		out.flush();
	}
}
