package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tai_khoan")
public class TaiKhoan {
	
	@Id
	@Column(name = "ten_dang_nhap")
	private String tenDangNhap;
	
	@Column( name = "mat_khau")
	private String matKhau;
	
	@Column(name = "quyen")
	private int quyen;
	
	@Column (name = "ho_ten")
	private String hoTen;
	
	@ManyToOne
	@JoinColumn(name = "ma_lop", nullable = false)
	private Lop maLop;
	
	@Column (name = "so_dien_thoai")
	private String soDienThoai;
	
	@Column (name = "ngay_thang_nam_sinh")
	private Date ngayThangNamSinh;

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public int getQuyen() {
		return quyen;
	}

	public void setQuyen(int quyen) {
		this.quyen = quyen;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Lop getMaLop() {
		return maLop;
	}

	public void setMaLop(Lop maLop) {
		this.maLop = maLop;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public Date getNgayThangNamSinh() {
		return ngayThangNamSinh;
	}

	public void setNgayThangNamSinh(Date ngayThangNamSinh) {
		this.ngayThangNamSinh = ngayThangNamSinh;
	}
	

}
