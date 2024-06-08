/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.ConnectDB.getConnect;
import static Controller.KhachHangDAO.conn;
import Model.HoaDon;
import Model.HoaDonDetail;
import Model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author audikan
 */
public class HoaDonDetailDAO {

    static Connection conn = ConnectDB.getConnect();

    public static List<Object[]> ListSPHD(int MaHD) {
        List<Object[]> dataList = new ArrayList<>();
        try {
            String sql = "SELECT sp.MaSP, sp.TenSP, sp.LoaiSP, hdt.Gia, hdt.SoLuong "
                    + "FROM HoaDonDetail hdt, SanPham sp "
                    + "WHERE hdt.MaHD = " + MaHD + " "
                    + "AND hdt.MaSP = sp.MaSP;";
            Statement stm = conn.createStatement();

            try (ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                while (rs.next()) {
                    int sl = rs.getInt("SoLuong");
                    int gia = rs.getInt("Gia");
                    int thanhtien = sl * gia;
                    dataList.add(new Object[]{rs.getInt("MaSP"), rs.getString("TenSP"), rs.getString("LoaiSP"), rs.getInt("Gia"), rs.getInt("SoLuong"), thanhtien});
                }
                return dataList;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<String> getHoaDonInfo(int MaHD) {
        String sql = "SELECT nv.HoTen, kh.TenKH, hd.NgayTao, kh.LoaiKH "
                + "FROM NhanVien nv, HoaDon hd, KhachHang kh "
                + "WHERE nv.MaNV = hd.MaNV AND kh.MaKH = hd.MaKH AND hd.MaHD = ?";

        List<String> dataList = new ArrayList<>();

        try {
            PreparedStatement pres = conn.prepareStatement(sql);
            pres.setInt(1, MaHD);

            try (ResultSet rs = pres.executeQuery()) {
                while (rs.next()) {
                    String tenNV = rs.getString("HoTen");
                    String tenKH = rs.getString("TenKH");
                    String ngayTao = rs.getString("NgayTao");
                    String loaiKH = rs.getString("LoaiKH");

                    dataList.add(tenNV);
                    dataList.add(tenKH);
                    dataList.add(ngayTao);
                    dataList.add(loaiKH);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }

        return dataList;
    }

    public static int ThemSPHD(HoaDonDetail HD) {
        String sql = "INSERT INTO HoaDonDetail (MaSP, MaHD, SoLuong, Gia) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pres = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pres.setInt(1, HD.getMaSP());
            pres.setInt(2, HD.getMaHD());
            pres.setInt(3, HD.getSoLuong());
            pres.setInt(4, HD.getGia());

            int affectedRows = pres.executeUpdate();

            if (affectedRows > 0) {
                // Lấy giá trị tự tăng của cột "MaNV"
                ResultSet generatedKeys = pres.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int maNV = generatedKeys.getInt(1);
                    // Đoạn code sau này bạn có thể sử dụng giá trị maNV theo nhu cầu
                    return maNV;
                }
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return 0;
    }


}
