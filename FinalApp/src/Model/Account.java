/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Anh Phi
 */
public class Account {

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", UserName=" + UserName + ", Password=" + Password + ", role=" + role + '}';
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    private int id;
    private String UserName, Password,role;

    public Account(int id, String UserName, String Password, String role) {
        this.id = id;
        this.UserName = UserName;
        this.Password = Password;
        this.role = role;
    }
    public Account(){
        
    }
    
    
}
