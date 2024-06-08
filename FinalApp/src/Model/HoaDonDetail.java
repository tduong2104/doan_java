/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author audikan
 */
public class HoaDonDetail {
    private int MaSP, MaHD, SoLuong, Gia;

    public HoaDonDetail(int MaSP, int MaHD, int SoLuong, int gia) {
        this.MaSP = MaSP;
        this.MaHD = MaHD;
        this.SoLuong = SoLuong;
        this.Gia = gia;
    }

    public int getMaSP() {
        return MaSP;
    }
    
    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        this.Gia = gia;
    }
    
    public int getMaHD() {
        return MaHD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
}
