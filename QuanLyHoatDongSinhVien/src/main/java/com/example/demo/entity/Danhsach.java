package com.example.demo.entity;


public class Danhsach {
	private int TT;
	private String MASV;
	private String HovaTen;
	private String Ngaysinh;
	private String Lop;
	private String B1;
	private String B2;
	private String B3;
	private String B4;
	private String B5;
	
	public Danhsach(int TT, String MASV, String HovaTen, String Ngaysinh, String Lop, String B1, String B2, String B3, String B4, String B5) {
        super();
        this.TT=TT;
        this.MASV=MASV;
        this.HovaTen=HovaTen;
        this.Ngaysinh=Ngaysinh;
        this.Lop=Lop;
        this.B1=B1;
        this.B2=B2;
        this.B3=B3;
        this.B4=B4;
        this.B5=B5;
    }
	public Danhsach() {};
	public int getTT() {
		return TT;
	}
	public void setTT(int tT) {
		TT = tT;
	}
	public String getMASV() {
		return MASV;
	}
	public void setMASV(String mASSV) {
		MASV = mASSV;
	}
	public String getHovaTen() {
		return HovaTen;
	}
	public void setHovaTen(String hoten) {
		HovaTen = hoten;
	}
	public String getNgaysinh() {
		return Ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		Ngaysinh = ngaysinh;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public String getB1() {
		return B1;
	}
	public void setB1(String b1) {
		B1 = b1;
	}
	public String getB2() {
		return B2;
	}
	public void setB2(String b2) {
		B2 = b2;
	}
	public String getB3() {
		return B3;
	}
	public void setB3(String b3) {
		B3 = b3;
	}
	public String getB4() {
		return B4;
	}
	public void setB4(String b4) {
		B4 = b4;
	}
	public String getB5() {
		return B5;
	}
	public void setB5(String b5) {
		B5 = b5;
	}
	
}


