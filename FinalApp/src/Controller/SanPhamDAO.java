package Controller;
import static Controller.ConnectDB.getConnect;
import static Controller.LoginDAO.conn;
import static Controller.NhanVienDAO.conn;
import Model.NhanVien;
import Model.SanPham;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
 
public class SanPhamDAO {
    static Connection conn = ConnectDB.getConnect();
    
    public static List<Object[]> ListSP(){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from SanPham";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaSP"), rs.getString("TenSP"), rs.getString("LoaiSP"), rs.getInt("Gia"), rs.getInt("SoLuong")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
    
    
    
    public static List<Object[]> ListDMSP(){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from DMSP";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                     dataList.add(new Object[]{rs.getInt("MaDMSP"), rs.getString("TenDMSP")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
    public static int ThemSP(SanPham SP) {
        String sql = "INSERT INTO SanPham (TenSP, LoaiSP, Gia, SoLuong) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pres = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pres.setString(1, SP.getTenSP());
            pres.setString(2, SP.getLoaiSP());
            pres.setInt(3, SP.getGia());
            pres.setInt(4, SP.getSoLuong());

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
    
    public static SanPham ShowSPbyMa(int MaSP){    
        try{
            String sql = "select * from SanPham Where MaSP = "+MaSP+";";
            Statement stm = conn.createStatement();
            try ( ResultSet rs = stm.executeQuery(sql)) {
                SanPham SP = new SanPham();
                 while (rs.next()) {
                    SP.setMaSP(rs.getInt("MaSP"));
                    SP.setTenSP(rs.getString("TenSP"));
                    SP.setLoaiSP(rs.getString("LoaiSP"));
                    SP.setGia(rs.getInt("Gia"));
                    SP.setSoLuong(rs.getInt("SoLuong"));
                 }
                 return SP;
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("Lỗi");
        }
        return null;
    }
    
    public static boolean DeleteSPbyMa(int MaSP){    
        try{
            String sql = "delete from SanPham Where MaSP = "+MaSP+";";
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
    
    public static boolean EditSP(SanPham SP) {
        String sql = "UPDATE SanPham "
                   + "SET TenSP = ?, LoaiSP = ?, Gia = ?, SoLuong = ?"
                   + "WHERE MaSP = ?;";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, SP.getTenSP());
            pstmt.setString(2, SP.getLoaiSP());
            pstmt.setInt(3, SP.getGia());
            pstmt.setInt(4, SP.getSoLuong());
            pstmt.setInt(5, SP.getMaSP());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
        return false;
    }
    
    public static boolean updateSoLuong(int sl, int ma) {
        String sql = "UPDATE SanPham "
                   + "SET SoLuong = SoLuong - ?"
                   + " WHERE MaSP = ? ;";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, sl);
            pstmt.setInt(2, ma);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi");
        }
        return false;
    }

    public static List<Object[]> TimKiemSP(String tukhoa){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from SanPham where TenSP like '%"+tukhoa+"%' or MaSP like '%"+tukhoa+"%' or LoaiSP  like '%"+tukhoa+"%';";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaSP"), rs.getString("TenSP"),rs.getString("LoaiSP"), rs.getInt("Gia"),rs.getInt("SoLuong")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
    
    public static int ThemSPGG(SanPham SP) {
        String sql = "INSERT INTO SanPhamGG (MaSP, TenSP, LoaiSP) VALUES (?, ?, ?)";
        try {
            PreparedStatement pres = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pres.setString(2, SP.getTenSP());
            pres.setString(3, SP.getLoaiSP());
            pres.setInt(1, SP.getMaSP());

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
    
    public static boolean XoaSPGG(int ma) {
        try {
            String sql = "delete from SanPhamGG Where MaSP = " + ma + ";";
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
    
    public static boolean XoaAllSPGG() {
        try {
            String sql = "delete from SanPhamGG;";
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
    
    public static List<Object[]> ListSPGG(){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from SanPham where MaSP not in (select MaSP from SanPhamGG);";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaSP"), rs.getString("TenSP"), rs.getString("LoaiSP")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
    
    public static List<Object[]> ListSPGGed(){
         List<Object[]> dataList = new ArrayList<>();        
         try{
            String sql = "select * from SanPhamGG";
            Statement stm = conn.createStatement();
           
            try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                    while (rs.next()) {
                        dataList.add(new Object[]{rs.getInt("MaSP"), rs.getString("TenSP"), rs.getString("LoaiSP")});
                    }
                    return dataList;
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
         return null;
    }
}
