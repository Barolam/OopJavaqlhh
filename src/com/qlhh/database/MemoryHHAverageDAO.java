package com.qlhh.database;

import java.util.ArrayList;
import java.util.List;

import com.qlhh.entity.HangHoa;

public class MemoryHHAverageDAO implements HHAverageDAO{

	@Override
	public double getAverageHH(List<HangHoa> danhSach) {
		double trungBinhDM = MemoryHHDB.getAverageHH(danhSach);
		return trungBinhDM;
	}

	
	

}
