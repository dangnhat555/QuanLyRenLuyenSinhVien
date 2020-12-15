package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.repository.TaiKhoanRepository;
import com.example.demo.service.TaiKhoanService;

public class TaiKhoanImpl implements TaiKhoanService {
	private final TaiKhoanRepository taiKhoanRepository;

	public TaiKhoanImpl(TaiKhoanRepository taiKhoanRepository) {
		super();
		this.taiKhoanRepository = taiKhoanRepository;
	}

	@Override
	public List<TaiKhoan> layHet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TaiKhoan> layMot(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Object> capNhat(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Object> xoa(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TaiKhoan luu(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return null;
	}

}
