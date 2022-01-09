/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectclass;

import javax.swing.JOptionPane;
import koneksi.konek;

/**
 *
 * @author ASUS
 */
public class nike extends interclass {
    
    public nike(){
        setproduct("Nike");
    }

    @Override
    public void cetak() {
        try{
            konek koneksi = new konek();
            connect = koneksi.configDB();
            st = connect.createStatement();
            String sql = "SELECT * FROM sneaky where Brand = 'International' and Product = 'nike'";
            rs = st.executeQuery(sql);
            while(rs.next()){
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
