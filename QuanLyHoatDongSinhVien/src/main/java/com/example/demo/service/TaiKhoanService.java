package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.TaiKhoan;

public interface TaiKhoanService {
	
	List<TaiKhoan> layHet();
	Optional<TaiKhoan> layMot(String id);
	Optional<Object> capNhat(TaiKhoan taiKhoan);
	Optional<Object> xoa(String id);
	TaiKhoan luu(TaiKhoan taiKhoan);

}
