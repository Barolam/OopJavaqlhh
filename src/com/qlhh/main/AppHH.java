package com.qlhh.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlhh.control.HHControlAdd;
import com.qlhh.control.HHControlPrint;
import com.qlhh.database.MemoryHHAddDAO;
import com.qlhh.database.MemoryHHPrintDAO;
import com.qlhh.ui.HHInAdd;
import com.qlhh.ui.HHMenu;
import com.qlhh.ui.HHOutAdd;
import com.qlhh.ui.HHOutPrint;



public class AppHH {

	public static void main(String[] args) {
		PrintWriter out;
 		HHMenu hhmenu;
 		Scanner in;
 		String prompt = "->";
 		HHControlAdd hhControlAdd;
 		HHInAdd hhInAdd;
 		MemoryHHAddDAO hhAddDAO;
 		HHOutAdd hhOutAdd;
 		HHControlPrint hhControlPrint;
 		MemoryHHPrintDAO hhPrintDAO;
 		HHOutPrint hhOutPrint;

 		
 		out =     new PrintWriter(System.out);
 		in =      new Scanner(System.in);
 		hhInAdd = new HHInAdd(out, in);
 		hhAddDAO = new MemoryHHAddDAO();
 		hhOutAdd = new HHOutAdd(out);
 		hhPrintDAO = new MemoryHHPrintDAO();
 		hhOutPrint = new HHOutPrint(out);
 		
 		hhControlPrint = new HHControlPrint(hhPrintDAO, hhOutPrint);
 		hhControlAdd = new HHControlAdd(hhAddDAO, hhOutAdd, hhInAdd);
 		hhmenu = new HHMenu(out, in, prompt, hhControlAdd);
 		hhmenu.setHHControlPrint(hhControlPrint);
 		
 		out.println("~~~~~~~~~~~~~ Chương trình QLHH ~~~~~~~~~~~~~");
 		out.flush();
 
 		hhmenu.controlLoop();
 		
	}

}
