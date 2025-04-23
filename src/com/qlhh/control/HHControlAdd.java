package com.qlhh.control;

import com.qlhh.database.HHAddDAO;
import com.qlhh.entity.HangHoa;
import com.qlhh.ui.HHInAdd;
import com.qlhh.ui.HHOutAdd;

public class HHControlAdd {
	HHAddDAO hhAddDAO;
	HHInAdd hhInAdd;
	HHOutAdd hhOutAdd;
	
	public HHControlAdd(HHAddDAO hhAddDAO, HHInAdd hhInAdd, HHOutAdd hhOutAdd) {
		this.hhAddDAO = hhAddDAO;
		this.hhInAdd = hhInAdd;
		this.hhOutAdd = hhOutAdd;
	}
	
	public void add() {
		HangHoa hh;
		hh = hhInAdd.input();
		hhAddDAO.insert(hh);
		hhOutAdd.showMessage(hh);
	}
}
