package com.qlhh.main;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlhh.control.HHControlAdd;
import com.qlhh.control.HHControlAverage;
import com.qlhh.control.HHControlPrint;
import com.qlhh.control.HHControlSum;
import com.qlhh.database.MemoryHHAddDAO;
import com.qlhh.database.MemoryHHAverageDAO;
import com.qlhh.database.MemoryHHPrintDAO;
import com.qlhh.database.MemoryHHSumDAO;
import com.qlhh.ui.HHInAdd;
import com.qlhh.ui.HHMenu;
import com.qlhh.ui.HHOutAdd;
import com.qlhh.ui.HHOutAverage;
import com.qlhh.ui.HHOutPrint;
import com.qlhh.ui.HHOutSum;



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
 		HHControlSum hhControlQuantity;
        MemoryHHSumDAO hhQuantityDAO;
        HHOutSum hhOutQuantity;
        HHOutAverage hhOutAverage;
        HHControlAverage hhControlAverage;
        MemoryHHAverageDAO memoryHHAverageDAO;
 		
 		out =     new PrintWriter(System.out);
 		in =      new Scanner(System.in);
 		hhInAdd = new HHInAdd(out, in);
 		hhAddDAO = new MemoryHHAddDAO();
 		hhOutAdd = new HHOutAdd(out);
 		hhPrintDAO = new MemoryHHPrintDAO();
 		hhOutPrint = new HHOutPrint(out);
 		hhQuantityDAO = new MemoryHHSumDAO();
        hhOutQuantity = new HHOutSum(out);
        memoryHHAverageDAO = new MemoryHHAverageDAO();
        hhOutAverage = new HHOutAverage(out);
 		
 		hhControlPrint = new HHControlPrint(hhPrintDAO, hhOutPrint);
 		hhControlAdd = new HHControlAdd(hhAddDAO, hhOutAdd, hhInAdd);
 		hhControlQuantity = new HHControlSum(hhQuantityDAO, hhOutQuantity);
 		hhControlAverage = new HHControlAverage(memoryHHAverageDAO, hhOutAverage);
 		hhmenu = new HHMenu(in, out, prompt, hhInAdd, hhControlPrint, hhControlAdd, hhControlQuantity, hhControlAverage);
 		hhmenu.setHHControlPrint(hhControlPrint);
 		hhmenu.setHHControlQuantity(hhControlQuantity);
 		
 		out.println("~~~~~~~~~~~~~ Chương trình QLHH ~~~~~~~~~~~~~");
 		out.flush();
 
 		hhmenu.controlLoop();
 		
	}

}
