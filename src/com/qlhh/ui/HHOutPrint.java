package com.qlhh.ui;

import java.io.PrintWriter;

import java.util.ArrayList;


import com.qlhh.database.MemoryHHDB;

import com.qlhh.entity.HangHoa;


public class HHOutPrint {
	
	private PrintWriter out;
	
	public HHOutPrint(PrintWriter out) {
		this.out  = out;
	}
	
	public void showDSHH(ArrayList<HangHoa> dsHH) {
		out.printf("%-10s %-20s %-10s %-10s\n","Tên Hàng",
				"Mã Hàng", "Số Lượng" , "Đơn Giá");
		out.flush();
		for (HangHoa hangHoa : dsHH) {
			out.printf("%-10d %-20s %-10s %-10s\n",
					hangHoa.gettenHang(),
					hangHoa.getmaHang(), 
					hangHoa.getsoLuong(),
					hangHoa.getdonGia()
					); //java.util.Date
			out.flush();
		}
	}
	

	
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		HHOutPrint hhOutPrint = new HHOutPrint(out);
		hhOutPrint.showDSHH(MemoryHHDB.getDSHH());
	}

}