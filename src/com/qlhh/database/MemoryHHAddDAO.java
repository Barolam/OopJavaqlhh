package com.qlhh.database;

import com.qlhh.entity.HangHoa;

public class MemoryHHAddDAO implements HHAddDAO{
	
	
 	public void insert(HangHoa hh) {
 		//gọi hàm static
 		MemoryHHDB.insert(hh);
 	}
}
