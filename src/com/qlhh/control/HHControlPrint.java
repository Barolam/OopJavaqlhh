package com.qlhh.control;

import java.util.ArrayList;

import com.qlhh.database.MemoryHHPrintDAO;
import com.qlhh.database.HHPrintDAO;
import com.qlhh.entity.HangHoa;
import com.qlhh.ui.HHOutPrint;

public class HHControlPrint {
	
	//private MemoryHHPrintDAO hhPrintDAO;
	private HHPrintDAO hhPrintDAO;
	private HHOutPrint hhOutPrint;
	
	public HHControlPrint(HHPrintDAO hhPrintDAO, HHOutPrint hhOutPrint) {
		this.hhPrintDAO = hhPrintDAO;
		this.hhOutPrint = hhOutPrint;
	}
	
	public void printHH() {
		ArrayList<HangHoa> dsHH;
		//gửi thông điệp đến đơi tượng HHPrintDAO
		dsHH = hhPrintDAO.getDSHH();
		
		//gửi thông điệp cho đối tượng HHOutPRint
		hhOutPrint.showDSHH(dsHH);
	}
	
	

}