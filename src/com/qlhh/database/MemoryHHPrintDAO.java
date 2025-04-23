package com.qlhh.database;

import java.util.ArrayList;

import com.qlhh.entity.HangHoa;

public class MemoryHHPrintDAO extends HHPrintDAO {
	
	public ArrayList<HangHoa> getDSHH(){
		return MemoryHHDB.getDSHH();
	}
}