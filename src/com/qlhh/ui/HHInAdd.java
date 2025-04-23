package com.qlhh.ui;

import java.io.PrintWriter;
import java.util.Scanner;

import com.qlhh.entity.HangDienMay;
import com.qlhh.entity.HangHoa;
import com.qlhh.entity.HangSanhSu;
import com.qlhh.entity.HangThucPham;

public class HHInAdd {
	private PrintWriter out;
	private Scanner in;
	//private HHOutAdd hhOutAdd;
	public HHInAdd() {

	}

	public HHInAdd(PrintWriter out, Scanner in/*HHOutAdd hhOutAdd*/) {
		this.out = out;
		this.in = in;
		//this.hhOutAdd = hhOutAdd;
	}

	public HangHoa input() {
		int maHang;
		String tenHang;
		int soLuong;
		double donGia;
		String matHang;
		HangHoa hh = null;

		out.print("[Ma Hang]: ");
		out.flush();
		maHang = in.nextInt();
		out.print("[Ten Hang]: ");
		out.flush();
		tenHang = in.nextLine();
		in.nextLine();
		out.print("[So Luong]: ");
		out.flush();
		soLuong = in.nextInt();
		out.print("[Don Gia]: ");
		out.flush();
		donGia = in.nextFloat();
		in.nextLine();
		out.print("[MAT HANG \"THUCPHAM\" / \"DIENMAY\" / \"SANHSU\" ]:");
		out.flush();

		matHang = in.nextLine();

		if ("THUCPHAM".equalsIgnoreCase(matHang)) {
			hh = inputHHTP(maHang, tenHang, soLuong, donGia);
		}

		if ("DIENMAY".equalsIgnoreCase(matHang)) {
			hh = inputHHDM(maHang, tenHang, soLuong, donGia);
		}

		if ("SANHSU".equalsIgnoreCase(matHang)) {
			hh = inputHHSS(maHang, tenHang, soLuong, donGia);
		}
		return hh;
	}

	private HangHoa inputHHTP(int maHang, String tenHang, int soLuong, double donGia) {
		int ngaySanXuat;
		int ngayHetHan;
		String nhaCungCap;

		out.print("[Ngay San Xuat]: ");
		out.flush();
		ngaySanXuat = in.nextInt();
		out.print("[Ngay Het Han]: ");
		out.flush();
		ngayHetHan = in.nextInt();
		out.print("[Nha Cung Cap]: ");
		out.flush();
		nhaCungCap = in.nextLine();

		HangThucPham hTP = new HangThucPham(maHang, tenHang, soLuong, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
		//hhOutAdd.showMessage(hTP);
		return hTP;
	}

	private HangHoa inputHHDM(int maHang, String tenHang, int soLuong, double donGia) {
		int thoiGianBH;
		int congSuat;

		out.print("[Thoi Gian BH]: ");
		out.flush();
		thoiGianBH = in.nextInt();
		out.print("[Cong Suat]: ");
		out.flush();
		congSuat = in.nextInt();

		HangDienMay hDM = new HangDienMay(maHang, tenHang, soLuong, donGia, thoiGianBH, congSuat);
		//hhOutAdd.showMessage(hDM);
		return hDM;
	}

	private HangHoa inputHHSS(int maHang, String tenHang, int soLuong, double donGia) {
		String nhaSanXuat;
		int ngayNhapKho;

		out.print("[Nha San Xuat]: ");
		out.flush();
		nhaSanXuat = in.nextLine();
		out.print("[Ngay Nhap Kho]: ");
		out.flush();
		ngayNhapKho = in.nextInt();

		HangSanhSu hSS = new HangSanhSu(maHang, tenHang, soLuong, donGia, nhaSanXuat, ngayNhapKho);
		//hhOutAdd.showMessage(hSS);
		return hSS;
	}

}
