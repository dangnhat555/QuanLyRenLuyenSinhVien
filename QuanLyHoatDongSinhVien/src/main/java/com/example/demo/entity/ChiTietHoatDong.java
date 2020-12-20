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
@Table(name = "chi_tiet_hoat_dong")
public class ChiTietHoatDong {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_chi_tiet_hd")
	private long maChiTietHD;
	
	@ManyToOne
	@JoinColumn(name = "ma_hoat_dong", nullable = false)
	private HoatDong maHoatDong;
	
	@ManyToOne
	@JoinColumn(name = "ten_dang_nhap", nullable = false)
	private TaiKhoan tenDangNhap;
	
	@Column(name = "hoat_dong")
	private boolean hoatDong;

	public long getMaChiTietHD() {
		return maChiTietHD;
	}

	public void setMaChiTietHD(long maChiTietHD) {
		this.maChiTietHD = maChiTietHD;
	}

	public HoatDong getMaHoatDong() {
		return maHoatDong;
	}

	public void setMaHoatDong(HoatDong maHoatDong) {
		this.maHoatDong = maHoatDong;
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