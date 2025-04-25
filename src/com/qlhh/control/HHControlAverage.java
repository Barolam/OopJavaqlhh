package com.qlhh.control;

import java.util.List;

import com.qlhh.database.HHAverageDAO;
import com.qlhh.database.MemoryHHDB;
import com.qlhh.entity.HangHoa;
import com.qlhh.ui.HHOutAverage;

public class HHControlAverage {
	private HHAverageDAO hhAverageDAO;
	private HHOutAverage hhOutAverage;
	
	public HHControlAverage(HHAverageDAO hhAverageDAO, HHOutAverage hhOutAverage) {
		this.hhAverageDAO = hhAverageDAO;
		this.hhOutAverage = hhOutAverage;
	}
	
	
	public void Average() {
		List<HangHoa> danhSach = MemoryHHDB.getDSHH();
		double average = MemoryHHDB.getAverageHH(danhSach);
        hhOutAverage.showAverage(average);
	}
	
	
}
