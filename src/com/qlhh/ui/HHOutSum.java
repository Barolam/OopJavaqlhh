package com.qlhh.ui;

import java.io.PrintWriter;

public class HHOutSum {
    private PrintWriter out;

    public HHOutSum(PrintWriter out) {
        this.out = out;
    }

    public void showTongSoLuong(int tongThucPham, int tongSanhSu, int tongDienMay) {
        out.println("Tổng số lượng thực phẩm: " + tongThucPham);
        out.println("Tổng số lượng sành sứ: " + tongSanhSu);
        out.println("Tổng số lượng điện máy: " + tongDienMay);
        out.flush();
    }
}