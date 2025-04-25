package com.qlhh.ui;
import java.io.PrintWriter;
import com.qlhh.database.MemoryHHDB;
;

public class HHOutAverage {
	private PrintWriter out;

	public HHOutAverage(PrintWriter out) {
		super();
		this.out = out;
	}
	
	public void showAverage(double average) {
		out.println("Trung binh so luong ton cua hang dien may: " + average+ " cai");
		out.flush();
	}
}
