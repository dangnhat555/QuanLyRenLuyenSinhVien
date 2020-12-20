package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import com.example.demo.entity.HoatDong;

public interface HoatDongService {
	List<HoatDong> layHet();
	Optional<HoatDong> layMot(Long id);
	Optional<Object> capNhat(HoatDong hoatDong);
	HoatDong luu(HoatDong hoatDong);
	Optional<Object> xoa(long id);
}
