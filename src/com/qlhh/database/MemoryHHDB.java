package com.qlhh.database;

import java.util.ArrayList;

import com.qlhh.entity.HangDienMay;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangThucPham;

public class MemoryHHDB {
	private static ArrayList<HangHoa> dbHH;
	
	static {
 		dbHH = new ArrayList<HangHoa>();
 		//tạo dữ liệu sẵn có cho DB
 		HangThucPham hTP1 = new HangThucPham(111,"sua", 5, 7000, 2, 9, "Vinamilk");
 		HangThucPham hTP2 = new HangThucPham(222, "Snack", 6, 21000, 3, 15, "OiShi");
 		HangDienMay hDM1 = new HangDienMay(333, "tu lanh", 3, 100000, 6, 1500);
 		HangDienMay hDM2 = new HangDienMay(444, "ti vi", 4, 50000, 3, 1000);
 		HangSanhSu hSS1 = new HangSanhSu(555,"Ly", 10, 3000, "Cong Ty", 20);
 		HangSanhSu hSS2 = new HangSanhSu(666,"chen", 10, 4000, "Cong Ty", 18);
// 		 svPM1 = new SinhVienPM(111, "Le Van Teo", 
// 				"PM", null, 4, 4, 4);
// 		SinhVienPM svPM2 = new SinhVienPM(222, "Le Van Tu", 
// 				"PM", null, 9, 9, 1);
// 		SinhVienKT svKT1 = new SinhVienKT(333, "Nguyen Thi Meo", 
// 				"KT", null, 7, 8);
// 		SinhVienKT svKT2 = new SinhVienKT(444, "Nguyen Thi Suu", 
// 				"KT", null, 2, 2);
// 		dbSV.add(svPM1);
// 		dbSV.add(svPM2);
// 		dbSV.add(svKT1);
// 		dbSV.add(svKT2);
 
 
 	}
	
	public static void insert(HangHoa hh) {
		dbHH.add(hh);
	}
	
	public static ArrayList<HangHoa> getDSHH(){
		return dbHH;
	}
	
	
 	
 	
 
}