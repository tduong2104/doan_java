/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author audikan
 */
public class SanPham {
    private int maSP, gia, soLuong;
    private String tenSP, loaiSP;

    public SanPham(int maSP, String tenSP, String loaiSP, int gia, int soLuong) {
        this.maSP = maSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
    }

    public SanPham(int maSP, String tenSP, String loaiSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
    }

    public SanPham() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getMaSP() {
        return maSP;
    }

    public int getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTenSP() {
        return tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
    
    public SanPham(String tenSP, String loaiSP, int gia, int soLuong){
        this.gia = gia;
        this.soLuong = soLuong;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSP=" + maSP + ", gia=" + gia + ", soLuong=" + soLuong + ", tenSP=" + tenSP + ", loaiSP=" + loaiSP + '}';
    }
}
