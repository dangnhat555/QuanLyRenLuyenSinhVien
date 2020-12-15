package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Lop;


public interface LopService {
	List<Lop> layHet();
	Optional<Lop> layMot(long id);
	Optional<Object> capNhat(Lop lop);
	Optional<Object> xoa(long id);
	Lop luu(Lop lop);
}
