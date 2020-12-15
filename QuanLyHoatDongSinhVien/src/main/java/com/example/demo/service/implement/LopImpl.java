package com.example.demo.service.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Lop;
import com.example.demo.repository.LopRepository;
import com.example.demo.service.LopService;

@Service
public class LopImpl implements LopService {
	private final LopRepository lopRepository;

	public LopImpl(LopRepository lopRepository) {
		super();
		this.lopRepository = lopRepository;
	}

	@Override
	public List<Lop> layHet() {
		// TODO Auto-generated method stub
		return lopRepository.findAll();
	}

	@Override
	public Optional<Lop> layMot(long id) {
		// TODO Auto-generated method stub
		return lopRepository.findById(id);
	}

	@Override
	public Optional<Object> capNhat(Lop lop) {
		// TODO Auto-generated method stub
		return lopRepository.findById(lop.getMaLop()).map(lop2 -> {
			lop2 = lop;
			return lopRepository.save(lop);
		});
	}

	@Override
	public Optional<Object> xoa(long id) {
		// TODO Auto-generated method stub
		return lopRepository.findById(id).map(lop -> {
			lopRepository.delete(lop);
			return ResponseEntity.ok().build();
		});
	}

	@Override
	public Lop luu(Lop lop) {
		// TODO Auto-generated method stub
		return lopRepository.save(lop);
	}

}
