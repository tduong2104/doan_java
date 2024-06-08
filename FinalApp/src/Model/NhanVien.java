/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author audikan
 */
public class NhanVien {
    private int maNV, luong, tuoi;
    private String hoten, SDT, NgVL, loaiNV;

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setNgVL(String NgVL) {
        this.NgVL = NgVL;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public int getMaNV() {
        return maNV;
    }
    
    public void setMaNV(int a) {
        this.maNV = a;
    }

    public int getLuong() {
        return luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", luong=" + luong + ", tuoi=" + tuoi + ", hoten=" + hoten + ", SDT=" + SDT + ", NgVL=" + NgVL + ", loaiNV=" + loaiNV + '}';
    }

    public NhanVien(int maNV, String hoten, String SDT, int tuoi, String NgVL, int luong, String loaiNV) {
        this.maNV = maNV;
        this.luong = luong;
        this.tuoi = tuoi;
        this.hoten = hoten;
        this.SDT = SDT;
        this.NgVL = NgVL;
        this.loaiNV = loaiNV;
    }
    public NhanVien(String hoten, String SDT, int tuoi, String NgVL, int luong, String loaiNV) {
        this.luong = luong;
        this.tuoi = tuoi;
        this.hoten = hoten;
        this.SDT = SDT;
        this.NgVL = NgVL;
        this.loaiNV = loaiNV;
    }

    public NhanVien() {
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getHoten() {
        return hoten;
    }

    public String getSDT() {
        return SDT;
    }

    public String getNgVL() {
        return NgVL;
    }

    public String getLoaiNV() {
        return loaiNV;
    }
    
    
}
