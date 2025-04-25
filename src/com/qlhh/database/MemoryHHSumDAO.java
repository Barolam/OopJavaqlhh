package com.qlhh.database;

import java.util.ArrayList;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangThucPham;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangDienMay;

public class MemoryHHSumDAO extends HHSumDAO {
    @Override
    public int getTongThucPham() {
        ArrayList<HangHoa> dsHangHoa = MemoryHHDB.getDSHH();
        int tongThucPham = 0;
        for (HangHoa hh : dsHangHoa) {
            if (hh instanceof HangThucPham) {
                tongThucPham += hh.getsoLuong();
            }
        }
        return tongThucPham;
    }

    @Override
    public int getTongSanhSu() {
        ArrayList<HangHoa> dsHangHoa = MemoryHHDB.getDSHH();
        int tongSanhSu = 0;
        for (HangHoa hh : dsHangHoa) {
            if (hh instanceof HangSanhSu) {
                tongSanhSu += hh.getsoLuong();
            }
        }
        return tongSanhSu;
    }

    @Override
    public int getTongDienMay() {
        ArrayList<HangHoa> dsHangHoa = MemoryHHDB.getDSHH();
        int tongDienMay = 0;
        for (HangHoa hh : dsHangHoa) {
            if (hh instanceof HangDienMay) {
                tongDienMay += hh.getsoLuong();
            }
        }
        return tongDienMay;
    }
}