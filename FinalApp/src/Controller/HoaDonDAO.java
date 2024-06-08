/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.KhachHangDAO.conn;
import Model.HoaDon;
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
public class HoaDonDAO {
    static Connection conn = ConnectDB.getConnect();
          
    public static List<Object[]> ListHD(){
        List<Object[]> dataList = new ArrayList<>();        
        try{
            String sql = "select * from HoaDon";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaHD"), rs.getInt("MaNV"),rs.getInt("MaKH"),rs.getInt("GTHD"),rs.getString("NgayTao")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
    
    public static boolean DeleteHDbyMa(int MaNV){    
        try{
            String sql = "delete from HoaDon Where MaHD = "+MaNV+";";
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
    
    public static int ThemHD(HoaDon HD) {
        String sql = "INSERT INTO HoaDon (MaKH, MaNV, NgayTao, GTHD) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pres = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pres.setInt(1, HD.getMaKH());
            pres.setInt(2, HD.getMaNV());
            pres.setString(3, HD.getNgayTao());
            pres.setInt(4, HD.getGTHD());

            int affectedRows = pres.executeUpdate();

            if (affectedRows > 0) {
                ResultSet generatedKeys = pres.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int maHD = generatedKeys.getInt(1);
                    return maHD;
                }
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return 0;
    }
    
    public static List<Object[]> TimKiemHD(String tukhoa){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from HoaDon where MaHD like '%"+tukhoa+"%' or MaKH like '%"+tukhoa+"%' or MaNV  like '%"+tukhoa+"%' or NgayTao  like '%"+tukhoa+"%';";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaHD"), rs.getInt("MaNV"),rs.getInt("MaKH"),rs.getInt("GTHD"),rs.getString("NgayTao")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
}
