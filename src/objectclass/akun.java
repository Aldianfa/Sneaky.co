/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectclass;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.konek;

/**
 *
 * @author ASUS
 */
public class akun {
    private String name;
    private String username;
    private String password;
    
    public Statement st;
    public Connection connect;
    public ResultSet rs;
    
//    boolean b;
    
    public void setname(String nm){
        name = nm;
    }
    public String getname(){
        return name;
    }
    public void setusername(String us){
        username = us;
    }
    public String getusername(){
        return username;
    }
    public void setpassword(String pw){
        password = pw;
    }
    public String getpassword(){
        return password;
    }
    
    public boolean login(){
        boolean b = false;
        try{
            konek koneksi = new konek();
            connect = koneksi.configDB();
            st = connect.createStatement();
            String sql = "SELECT * FROM dblogin where username="+getusername()
                    + " and password='"+getpassword()+"'";
            rs = st.executeQuery(sql);
            
            while (rs.next()){
                if(getusername().equals(rs.getString("username"))
                        && getpassword().equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Login Berhasil" );
                    b = true;
                }else{
                    b = false;
                }
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Login Gagal!");
        }
        return b;
    }
}
