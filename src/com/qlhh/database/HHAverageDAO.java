package com.qlhh.database;

import java.util.ArrayList;
import java.util.List;

import com.qlhh.entity.HangHoa;

public interface HHAverageDAO {
	public abstract double getAverageHH(List<HangHoa> danhSach);
}
