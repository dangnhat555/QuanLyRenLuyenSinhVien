package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hoat_dong")
public class HoatDong {

	@Id
	@Column(name = "ma_hoat_dong")
	private Long maHoatDong;

	@Column(name = "ten_hoat_dong")
	private String tenHoatDong;

	@ManyToOne
	@JoinColumn(name = "ten_dang_nhap")
	private TaiKhoan tenDangNhap;

	@Column(name = "hoat_dong")
	private boolean hoatDong;

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

	public TaiKhoan getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(TaiKhoan tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public boolean isHoatDong() {
		return hoatDong;
	}

	public void setHoatDong(boolean hoatDong) {
		this.hoatDong = hoatDong;
	}

}
