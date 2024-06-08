/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author audikan
 */
public class KhachHang {
   private int maKH;
   private String TenKH, SDT, LoaiKH;

    public KhachHang() {
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setLoaiKH(String LoaiKH) {
        this.LoaiKH = LoaiKH;
    }

    public int getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public String getSDT() {
        return SDT;
    }

    public String getLoaiKH() {
        return LoaiKH;
    }

    public KhachHang(String TenKH, String SDT, String LoaiKH) {
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.LoaiKH = LoaiKH;
    }

    public KhachHang(int maKH, String TenKH, String SDT, String LoaiKH) {
        this.maKH = maKH;
        this.TenKH = TenKH;
        this.SDT = SDT;
        this.LoaiKH = LoaiKH;
    }
}
