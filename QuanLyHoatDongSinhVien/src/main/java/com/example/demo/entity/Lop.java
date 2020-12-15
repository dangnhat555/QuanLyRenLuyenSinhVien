package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lop")
public class Lop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ma_lop")
	private Long maLop;
	
	@Column(name = "khoa")
	private String khoa;
	
	@Column(name = "ten_lop")
	private String tenLop;

	public Long getMaLop() {
		return maLop;
	}

	public void setMaLop(Long maLop) {
		this.maLop = maLop;
	}

	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	
	
}
