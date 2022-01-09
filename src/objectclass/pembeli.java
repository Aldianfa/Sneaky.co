/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectclass;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.konek;

/**
 *
 * @author ASUS
 */
public class pembeli {
    
    private String name;
    private String alamat;
    private String nohp;
    private String email;
    
    public Statement st;
    public Connection connect;
    public ResultSet rs;
    
    String kode,brand,product,nmproduct,warna,harga;
    int ukuran;
    
    public void setname(String nm){
        name = nm;
    }
    public String getname(){
        return name;
    }
    public void setalamat(String at){
        alamat=at;
    }
    public String getalamat(){
        return alamat;
    }
    public void setnohp(String hp){
        nohp = hp;
    }
    public String getnohp(){
        return nohp;
    }
    public void setemail(String em){
        email = em;
    }
    public String getemail(){
        return email;
    }
    
    public void beli(){
        konek koneksi = new konek();
        
        try{
            connect = koneksi.configDB();
            st=connect.createStatement();
            
            String sql1 = "insert into pembeli valuees (?,?,?,?)";
            PreparedStatement ps1 = connect.prepareStatement(sql1);
            ps1.setString(1, getname());
            ps1.setString(2, getalamat());
            ps1.setString(3, getnohp());
            ps1.setString(4, getemail());
            int a = ps1.executeUpdate();
        }catch (HeadlessException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    // materi overload
    public void beli(String kd){
        konek koneksi = new konek();
        
        try{
            connect = koneksi.configDB();
            st=connect.createStatement();
            
            String sql4 = "SELECT * FROM sneaky where kode='" +kd+"'";
            rs = st.executeQuery(sql4);
            while(rs.next()){
                kode = rs.getString("Kode");
                brand = rs.getString("Brand");
                product = rs.getString("Product");
                nmproduct = rs.getString("Nama product");
                warna = rs.getString("Warna");
                ukuran = Integer.parseInt(rs.getString("Ukuran"));
                harga = rs.getString("Harga");
            }
            
            String sql2 = "insert into riwayat values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps2 = connect.prepareStatement(sql2);
            ps2.setString(1, kode);
            ps2.setString(2, brand);
            ps2.setString(3, product);
            ps2.setString(4, nmproduct);
            ps2.setString(5, warna);
            ps2.setInt(6, ukuran);
            ps2.setString(7, harga);
            ps2.setString(8, getname());
            ps2.setString(9, getalamat());
            int b = ps2.executeUpdate();
            
            if (b==1){
                JOptionPane.showMessageDialog(null, "Pembelian Berhasil");
                
                String sql3 = "delete from sneaky where Kode='"+kd+"'";
                PreparedStatement ps3=connect.prepareStatement(sql3);
                int d = ps3.executeUpdate();
            }
        }catch(HeadlessException | SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}
