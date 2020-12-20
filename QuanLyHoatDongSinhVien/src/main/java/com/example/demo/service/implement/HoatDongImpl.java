package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HoatDong;
import com.example.demo.repository.HoatDongRepository;
import com.example.demo.service.HoatDongService;

@Service
public class HoatDongImpl implements HoatDongService {
	
	private final HoatDongRepository hoatDongRepository;

	public HoatDongImpl(HoatDongRepository hoatDongRepository) {
		super();
		this.hoatDongRepository = hoatDongRepository;
	}

	@Override
	public List<HoatDong> layHet() {
		// TODO Auto-generated method stub
		return hoatDongRepository.findAll();
	}

	@Override
	public Optional<HoatDong> layMot(Long id) {
		// TODO Auto-generated method stub
		return hoatDongRepository.findById(id);
	}

	@Override
	public Optional<Object> capNhat(HoatDong hoatDong) {
		// TODO Auto-generated method stub
		return hoatDongRepository.findById(hoatDong.getMaHoatDong()).map(hoatDong2 -> {
			hoatDong2 = hoatDong;
			return hoatDongRepository.save(hoatDong);
		});
	}

	@Override
	public Optional<Object> xoa(long id) {
		// TODO Auto-generated method stub
		return hoatDongRepository.findById(id).map(hoatDong -> {
			hoatDongRepository.delete(hoatDong);
			return ResponseEntity.ok().build();
		});
	}

	@Override
	public HoatDong luu(HoatDong hoatDong) {
		// TODO Auto-generated method stub
		return hoatDongRepository.save(hoatDong);
	}
}
