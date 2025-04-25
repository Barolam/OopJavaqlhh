package com.qlhh.control;

import com.qlhh.database.HHSumDAO;
import com.qlhh.ui.HHOutSum;

public class HHControlSum {
    private HHSumDAO hhSumDAO;
    private HHOutSum hhOutSum;

    public HHControlSum(HHSumDAO hhSumDAO, HHOutSum hhOutSum) {
        this.hhSumDAO = hhSumDAO;
        this.hhOutSum = hhOutSum;
    }

    public void xuLiThongTin() {
        int tongThucPham = hhSumDAO.getTongThucPham();
        int tongSanhSu = hhSumDAO.getTongSanhSu();
        int tongDienMay = hhSumDAO.getTongDienMay();
        hhOutSum.showTongSoLuong(tongThucPham, tongSanhSu, tongDienMay);
    }
}