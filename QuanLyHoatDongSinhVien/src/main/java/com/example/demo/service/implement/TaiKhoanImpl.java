package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TaiKhoan;
import com.example.demo.repository.TaiKhoanRepository;
import com.example.demo.service.TaiKhoanService;

@Service

public class TaiKhoanImpl implements TaiKhoanService {
	private final TaiKhoanRepository taiKhoanRepository;

	public TaiKhoanImpl(TaiKhoanRepository taiKhoanRepository) {
		super();
		this.taiKhoanRepository = taiKhoanRepository;
	}

	@Override
	public List<TaiKhoan> layHet() {
		// TODO Auto-generated method stub
		return taiKhoanRepository.findAll();
	}

	@Override
	public Optional<TaiKhoan> layMot(String id) {
		// TODO Auto-generated method stub
		return taiKhoanRepository.findById(id);
	}

	@Override
	public Optional<Object> capNhat(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanRepository.findById(taiKhoan.getTenDangNhap()).map(taiKhoan2->{
			taiKhoan2 = taiKhoan;
			return taiKhoanRepository.save(taiKhoan);
		});
	}

	@Override
	public Optional<Object> xoa(String id) {
		// TODO Auto-generated method stub
		return taiKhoanRepository.findById(id).map(taikhoan ->{
			taiKhoanRepository.delete(taikhoan);
			return ResponseEntity.ok().build();
		});
	}

	@Override
	public TaiKhoan luu(TaiKhoan taiKhoan) {
		// TODO Auto-generated method stub
		return taiKhoanRepository.save(taiKhoan);
	}

}
