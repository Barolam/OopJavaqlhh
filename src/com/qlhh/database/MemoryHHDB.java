package com.qlhh.database;

import java.util.ArrayList;
import java.util.List;

import com.qlhh.entity.HangDienMay;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangThucPham;

public class MemoryHHDB {
	private static ArrayList<HangHoa> dbHH;
	
	static {
 		dbHH = new ArrayList<HangHoa>();
 		//tạo dữ liệu sẵn có cho DB
 		 // Dữ liệu hiện có
        HangDienMay hDM = new HangDienMay(1, "tủ lạnh", 10, 5000000, 12, 300);
        HangSanhSu hSS = new HangSanhSu(2, "ly", 50, 20000, "Nhà sản xuất A", 20230101);
        HangThucPham hTP = new HangThucPham(3, "sữa", 100, 25000, 20230101, 20230131, "Vinamilk");
        HangDienMay hDM2 = new HangDienMay(4, "máy giặt", 5, 8000000, 24, 500);
        HangSanhSu hSS2 = new HangSanhSu(5, "bát", 30, 15000, "Nhà sản xuất B", 20230215);
        HangThucPham hTP2 = new HangThucPham(6, "gạo", 200, 18000, 20230301, 20240301, "Công ty Gạo Việt");

        // Thêm vào danh sách
        dbHH.add(hDM);
        dbHH.add(hSS);
        dbHH.add(hTP);
        dbHH.add(hDM2);
        dbHH.add(hSS2);
        dbHH.add(hTP2);
  
 
 	}
	
	public static void insert(HangHoa hh) {
		dbHH.add(hh);
	}
	
	public static ArrayList<HangHoa> getDSHH(){
		return dbHH;
	}
	
	
 	public static double getAverageHH(List<HangHoa> danhSach){
 		//nhận vào một danh sách các đối tượng HangHoa 
 		//và trả về giá trị trung bình kiểu double
 		int trungBinhDM = 0;
 	    int dem = 0;

 	    for (HangHoa hh : danhSach) {
 	        if (hh instanceof HangDienMay) {
 	        	trungBinhDM += hh.getsoLuong();
 	            dem++;
 	        }
 	    }

 	    if (dem == 0) return 0;
 	    return (double) trungBinhDM / dem;
 	}
 	
 
}