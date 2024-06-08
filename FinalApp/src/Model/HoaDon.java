/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author audikan
 */
public class HoaDon {
    private int MaHD, MaNV, MaKH, GTHD;
    private String ngayTao;

    public HoaDon(int MaHD, int MaNV, int MaKH, int GTHD, String ngayTao) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.GTHD = GTHD;
        this.ngayTao = ngayTao;
    }
    
     public HoaDon(int MaNV, int MaKH, String ngayTao) {
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.ngayTao = ngayTao;
    }

    public HoaDon(int MaNV, int MaKH, int GTHD) {
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.GTHD = GTHD;
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        this.ngayTao = formattedDate;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "MaHD=" + MaHD + ", MaNV=" + MaNV + ", MaKH=" + MaKH + ", GTHD=" + GTHD + ", ngayTao=" + ngayTao + '}';
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public void setGTHD(int GTHD) {
        this.GTHD = GTHD;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getMaHD() {
        return MaHD;
    }

    public int getMaNV() {
        return MaNV;
    }

    public int getMaKH() {
        return MaKH;
    }

    public int getGTHD() {
        return GTHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public HoaDon(int MaNV, int MaKH, int GTHD, String ngayTao) {
        this.MaNV = MaNV;
        this.MaKH = MaKH;
        this.GTHD = GTHD;
        this.ngayTao = ngayTao;
    }

    
}
