/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import static Controller.ConnectDB.getConnect;
import static Controller.LoginDAO.Login;
import static Controller.LoginDAO.conn;
import Model.KhachHang;
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
public class KhachHangDAO {
     static Connection conn = ConnectDB.getConnect();
          
     public static List<Object[]> ListKH(){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from KhachHang";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaKH"), rs.getString("TenKH"), rs.getString("SDT"), rs.getString("LoaiKH")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
     public static List<Object[]> TimKiemKH(String tukhoa){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from KhachHang where TenKH like '%"+tukhoa+"%' or MaKH like '%"+tukhoa+"%' or LoaiKH  like '%"+tukhoa+"%';";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaKH"), rs.getString("TenKH"), rs.getInt("SDT"), rs.getString("LoaiKH")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
     
    public static int ThemKH(KhachHang KH) {
        String sql = "INSERT INTO KhachHang (TenKH, SDT, LoaiKH) VALUES (?, ?, ?)";
        try {
            PreparedStatement pres = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pres.setString(1, KH.getTenKH());
            pres.setString(2, KH.getSDT());
            pres.setString(3, KH.getLoaiKH());

            int affectedRows = pres.executeUpdate();

            if (affectedRows > 0) {
                ResultSet generatedKeys = pres.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int maKH = generatedKeys.getInt(1);
                    return maKH;
                }
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return 0;
    }

    public static KhachHang ShowKHbyMa(int MaKH){    
        try{
            String sql = "select * from KhachHang Where MaKH = "+MaKH+";";
            Statement stm = conn.createStatement();
            try ( ResultSet rs = stm.executeQuery(sql)) {
                KhachHang KH = new KhachHang();
                 while (rs.next()) {
                    KH.setMaKH(rs.getInt("MaKH"));
                    KH.setTenKH(rs.getString("TenKH"));
                    KH.setSDT(rs.getString("SDT"));
                    KH.setLoaiKH(rs.getString("LoaiKH"));
                 }
                 return KH;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return null;
    }
//    ------------- Xóa ------------------
    public static boolean DeleteKHbyMa(int MaNV){    
        try{
            String sql = "delete from KhachHang Where MaKH = "+MaNV+";";
            Statement stm = conn.createStatement();
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            int rowsAffected = preparedStatement.executeUpdate();
            preparedStatement.close();
            if(rowsAffected == 1) return true;
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return false;
    }
    public static boolean EditKH(KhachHang KH) {
        String sql = "UPDATE KhachHang "
                   + "SET TenKH = ?, SDT = ?, LoaiKH = ? "
                   + "WHERE MaKH = ?;";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, KH.getTenKH());
            pstmt.setString(2, KH.getSDT());
            pstmt.setString(3, KH.getLoaiKH());
            pstmt.setInt(4, KH.getMaKH());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
        return false;
    }
    public static boolean isKHVIP(String ten) {
        String sql = "SELECT MaKH FROM KhachHang WHERE TenKH = ? AND LoaiKH = 'VIP';";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, ten);
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return false;
    }
    
    public static int GetMaByTen(String tukhoa) {
        try {
            String sql = "SELECT MaKH FROM KhachHang WHERE TenKH = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, tukhoa);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getInt("MaKH");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
