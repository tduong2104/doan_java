/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Controller.ConnectDB.getConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author audikan
 */
public class LoginDAO {
    static Connection conn = ConnectDB.getConnect();
    
    public static boolean Login(String user, String pass){
        try{
            String sql = "select * from Account where Username = '"+user+"' and Password = '"+pass+"';";
            Statement stm = conn.createStatement();
           
             try ( ResultSet rs = stm.executeQuery(sql)) {
                // Kiểm tra xem ResultSet có dữ liệu hay không
                if (rs.next()) {
                    return true; // Có dữ liệu khớp với thông tin đăng nhập
                }
            }
        }catch(SQLException e){
             e.printStackTrace();
        } 
       return false;
    }
    
}
