package com.qlhh.ui;
import java.io.PrintWriter;
import java.util.Scanner;
public class HHMenu {
	Scanner in;
	PrintWriter out;
	String prompt;
//	HangHoaInput hhInput;//buoc 1
//	HHControlPrint hhControlPrint;
//	HHRemove hhRemove;
	
	
	HHMenu(){
//		in = new Scanner(System.in);
//		out = new PrintWriter(System.out);
//		prompt = "->";
//		hhInput = new HangHoaInput();
//		hhControlPrint = new HHControlPrint();
//		hhRemove = new HHRemove();
		
		}
	
	HHMenu(Scanner _in, PrintWriter _out, String _prompt){
		in = _in;
		out = _out;
		prompt = _prompt;
		
	}
//	HHMenu(Scanner _in, PrintWriter _out, String _prompt, 
//			HangHoaInput _hhInput){
//		this(_in, _out, _prompt);
//		hhInput = _hhInput;
		
//	}
//	HHMenu(Scanner _in, PrintWriter _out, String _prompt, 
//			HangHoaInput _hhInput, HHControlPrint _hhControlPrint, HHRemove _hhRemove)
//	{
//		this(_in, _out, _prompt, _hhInput);
//		hhControlPrint = _hhControlPrint;
//		hhRemove = _hhRemove;
//		
//	}
	
	void controlLoop() {
		out.println("go lenh \"help\" de duoc ho tro!!!");
		out.flush();
		while(true) {
			String command;
			out.print(prompt);
			out.flush();
			command = in.nextLine();
			
			//cat khoang trang 2 dau
			command = command.trim();
			
			if("help".equalsIgnoreCase(command)) {
 				help();
 				continue;
 			}
 			
 			if("quit".equalsIgnoreCase(command)) {
 				break;
 			}
 			
 			if("add".equalsIgnoreCase(command)) {
 				add();
 				continue;
 			}
 			if("remove".equalsIgnoreCase(command)) {
 				remove();
 				continue;
 			}
 			if("print".equalsIgnoreCase(command)) {
				print();
				continue;
			}
 			if("search".equalsIgnoreCase(command)) {
				print();
				continue;
 			}
 			
		}
}

	
	private void remove() {
		out.print("Nhap Ma Hang De Xoa: ");
        out.flush();
        String maHang = in.nextLine();
        in.nextLine(); // consume newline
        MemoryHHDB.deleteHH(maHang);
        hhRemove.delete(maHang);
        
}

	
	private void print() {
	hhControlPrint.printHH();
		
	}

	private void add() {
		hhInput.input();;
	}
//	private void update() {
//        out.print("[NHẬP MÃ MẶT  ĐỂ CẬP NHẬT]: ");
//        out.flush();
//        String maHang = in.nextLine();
//
//        out.print("[NHẬP TÊN HÀNG MỚI]: ");
//        out.flush();
//        String tenHang = in.nextLine();
//
//        out.print("[NHẬP SỐ LƯỢNG MỚI]: ");
//        out.flush();
//        int soLuong = in.nextInt();
//
//        out.print("[NHẬP GIÁ MỚI]: ");
//        out.flush();
//        double donGia = in.nextDouble();
//
//        out.print("[NHẬP NGÀY SẢN XUẤT MỚI]: ");
//        out.flush();
//        int ngaySanXuat = in.nextInt();
//
//        out.print("[NHẬP NGÀY HẾT HẠN MỚI]: ");
//        out.flush();
//        int ngayHetHan = in.nextInt();
//
//        out.print("[NHẬP NHÀ CUNG CẤP MỚI]: ");
//        out.flush();
//        String nhaCungCap = in.nextLine();
//        in.nextLine();
//
//        out.print("[NHẬP NGÀY NHẬP KHO MỚI]: ");
//        out.flush();
//        int ngayNhapKho = in.nextInt();
//        in.nextLine();
//
//        out.print("[NHẬP NHÀ SẢN XUẤT MỚI]: ");
//        out.flush();
//        String nhaSanXuat = in.nextLine();
//        
//        out.print("[NHẬP THỜI GIAN BẢO HÀNH MỚI]: ");
//        out.flush();
//        int thoiGianBH = in.nextInt();
//
//        out.print("[NHẬP CÔNG SUẤT MỚI]: ");
//        out.flush();
//        int congSuat = in.nextInt();
//
//        // Cập nhật thông tin đặt phòng
//        if (MemoryHHDB.updateHH(maHang, tenHang, soLuong, donGia, nhaSanXuat, ngayNhapKho, ngaySanXuat, ngayHetHan, nhaCungCap, thoiGianBH, congSuat)) { // Gọi trực tiếp từ MemoryKSDB
//            out.println("Đã cập nhật thành công mã hàng: " + maHang);
//        } else {
//            out.println("Không tìm thấy mã hàng: " + maHang);
//        }
//        out.flush();
//    }


	private void help() {
		out.println("~~~~~~~~Help Menu~~~~~~~~");
 		out.flush();
 		out.println("[HELP] hướng dẫn sử dụng phần mềm");
 		out.flush();
 		out.println("[ADD] them mới một hàng hóa");
 		out.flush();
 		out.println("[REMOVE] xóa một hàng hóa");
 		out.flush();
 		out.println("[PRINT] in tất cả hàng hóa");
 		out.flush();
 		out.println("[QUIT] thoát khỏi phần mềm");
 		out.flush();
 		out.println("[SEARCH] để tìm kiếm thực phẩm 1 tuần nữa hết hạn");
 		out.flush();
 		out.println("[QUANTITY] tổng số lượng hàng hóa");
 		out.flush();
 		out.println("[UPDATE] để cập nhâtS hàng hóa");
 		out.flush();
 		out.println("~~~~~~~~Help Menu~~~~~~~~");
 		out.flush();
	}
}
	
