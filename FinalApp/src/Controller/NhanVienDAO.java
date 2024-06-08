/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.ConnectDB.getConnect;
import static Controller.LoginDAO.Login;
import static Controller.LoginDAO.conn;
import Model.NhanVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author audikan
 */
public class NhanVienDAO {

    static Connection conn = ConnectDB.getConnect();

    public static List<Object[]> ListNV() {
        List<Object[]> dataList = new ArrayList<>();
        try {
            String sql = "select * from NhanVien";
            Statement stm = conn.createStatement();

            try (ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                while (rs.next()) {
                    dataList.add(new Object[]{rs.getInt("MaNV"), rs.getString("HoTen"), rs.getInt("Luong"), rs.getString("NgayVaoLam")});
                }
                return dataList;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Object[]> TimKiemNV(String tukhoa) {
        List<Object[]> dataList = new ArrayList<>();
        try {
            String sql = "select * from NhanVien where HoTen like '%" + tukhoa + "%' or MaNV like '%" + tukhoa + "%' or LoaiNV  like '%" + tukhoa + "%';";
            Statement stm = conn.createStatement();

            try (ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                while (rs.next()) {
                    dataList.add(new Object[]{rs.getInt("MaNV"), rs.getString("HoTen"), rs.getInt("Luong"), rs.getString("NgayVaoLam")});
                }
                return dataList;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int ThemNV(NhanVien NV) {
        String sql = "INSERT INTO NhanVien (HoTen, SDT, Tuoi, NgayVaoLam, Luong, LoaiNV) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pres = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pres.setString(1, NV.getHoten());
            pres.setString(2, NV.getSDT());
            pres.setInt(3, NV.getTuoi());
            pres.setString(4, NV.getNgVL());
            pres.setInt(5, NV.getLuong());
            pres.setString(6, NV.getLoaiNV());

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

    public static NhanVien ShowNVbyMa(int MaNV) {
        try {
            String sql = "select * from NhanVien Where MaNV = " + MaNV + ";";
            Statement stm = conn.createStatement();
            try (ResultSet rs = stm.executeQuery(sql)) {
                NhanVien NV = new NhanVien();
                while (rs.next()) {
                    NV.setMaNV(rs.getInt("MaNV"));
                    NV.setHoten(rs.getString("HoTen"));
                    NV.setLuong(rs.getInt("Luong"));
                    NV.setNgVL(rs.getString("NgayVaoLam"));
                    NV.setLoaiNV(rs.getString("LoaiNV"));
                    NV.setTuoi(rs.getInt("Tuoi"));
                    NV.setSDT(rs.getString("SDT"));
                }
                return NV;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return null;
    }
//    ------------- Xóa ------------------

    public static boolean DeleteNVbyMa(int MaNV) {
        try {
            String sql = "delete from NhanVien Where MaNV = " + MaNV + ";";
            Statement stm = conn.createStatement();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            if (rowsAffected == 1) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return false;
    }

    public static boolean EditNV(NhanVien NV) {
        String sql = "UPDATE NhanVien "
                + "SET HoTen = ?, Luong = ?, Tuoi = ?, NgayVaoLam = ?, LoaiNV = ?, SDT = ? "
                + "WHERE MaNV = ?;";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, NV.getHoten());
            pstmt.setDouble(2, NV.getLuong());
            pstmt.setInt(3, NV.getTuoi());
            pstmt.setString(4, NV.getNgVL());
            pstmt.setString(5, NV.getLoaiNV());
            pstmt.setString(6, NV.getSDT());
            pstmt.setInt(7, NV.getMaNV());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
        return false;
    }

    public static int GetMaByTen(String tukhoa) {
        try {
            String sql = "SELECT MaNV FROM NhanVien WHERE HoTen = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, tukhoa);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getInt("MaNV");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
}
