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
import javax.swing.table.DefaultTableModel;
import koneksi.konek;

/**
 *
 * @author ASUS
 */
public class local extends sepatu{
    
    public DefaultTableModel model;
    public Statement st;
    public Connection connect;
    public ResultSet rs;
    
    public local(){
        setbrand("Local Brand");
    }

    @Override
    public void insert() {
      konek koneksi = new konek();
        try{
            connect = koneksi.configDB();
            
            String sql1="insert into sneaky values (?,?,?,?,?,?,?)";
            PreparedStatement ps1 = connect.prepareStatement(sql1);
            
            ps1.setString(1, getkode());
            ps1.setString(2, getbrand());
            ps1.setString(3, getproduct());
            ps1.setString(4, getnmproduct());
            ps1.setString(5, getwarna());
            ps1.setInt(6, getukuran());
            ps1.setString(7, getharga());
            
            int a = ps1.executeUpdate();
            
            if (a == 1){
                JOptionPane.showMessageDialog(null, "Sepatu "+ getnmproduct()
                        +" berhasil ditambahkan!");
            }
        }catch (HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Data belum terisi semua!");
        }
    }

//    @Override
//    public void delete() {
//        Connection connect = null;
//        Statement s = null;
//        
//        konek koneksi = new konek();
//        int choose = JOptionPane.showConfirmDialog(null, "Apakah ingin menghapus data ini?");
//        if (choose==0){
//            try {
//                connect = koneksi.configDB();
//                
//                String sql="delete from sneakers where product='" +getnmproduct() + "'";
//                PreparedStatement ps = connect.prepareStatement(sql);
//                int a = ps.executeUpdate();
//                
//                if (a==1){
//                    JOptionPane.showMessageDialog(null, "Sepatu "+getnmproduct()
//                    + " Berhasil Dihapus!");
//                }
//            }catch (HeadlessException|SQLException ex){
//                System.out.println(ex.getMessage());
//            }
//        }
//    }

    @Override
    public void cetak() {
        konek koneksi = new konek();
        
        try{
            connect = koneksi.configDB();
            st = connect.createStatement();
            
            String sql = "SELECT * FROM sneakers where Brand = 'local'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Object[] obj = new Object[20];
                obj[0] = rs.getString("kode");
                obj[1] = rs.getString("brand");
                obj[2] = rs.getString("product");
                obj[3] = rs.getString("nama product");
                obj[4] = rs.getString("warna");
                obj[5] = rs.getString("ukuran");
                obj[6] = rs.getString("harga");
                
                model.addRow(obj);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
