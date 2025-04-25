package com.qlhh.control;

import com.qlhh.database.HHAddDAO;
import com.qlhh.entity.HangHoa;
import com.qlhh.ui.HHInAdd;
import com.qlhh.ui.HHOutAdd;

public class HHControlAdd {
	private HHAddDAO hhAddDAO;
	private HHOutAdd hhOutAdd;
	private HHInAdd hhInAdd;
	
	
	
	public HHControlAdd(HHAddDAO hhAddDAO, HHOutAdd hhOutAdd, HHInAdd hhInAdd) {
		this.hhAddDAO = hhAddDAO;
		this.hhOutAdd = hhOutAdd;
		this.hhInAdd = hhInAdd;
		
	}
	
	public void add() {
		HangHoa hh;
		hh = hhInAdd.input();
		hhAddDAO.insert(hh);
		hhOutAdd.showMessage(hh);
	}
}



