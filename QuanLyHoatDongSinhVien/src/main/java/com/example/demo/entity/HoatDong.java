package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hoat_dong")
public class HoatDong {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_hoat_dong")
	private Long maHoatDong;

	
	@Column(name = "ten_hoat_dong")
	private String tenHoatDong;

	@Column(name = "tinh_trang")
	private boolean tinhTrang;

	public Long getMaHoatDong() {
		return maHoatDong;
	}

	public void setMaHoatDong(Long maHoatDong) {
		this.maHoatDong = maHoatDong;
	}

	public String getTenHoatDong() {
		return tenHoatDong;
	}

	public void setTenHoatDong(String tenHoatDong) {
		this.tenHoatDong = tenHoatDong;
	}

	public boolean isTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(boolean tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

}
