/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectclass;

/**
 *
 * @author ASUS
 */
public abstract class sepatu {
    private String kode;
    private String brand;
    private String product;
    private String nmproduct;
    private String warna;
    private int ukuran;
    private String harga;
    
    // Materi Abstract Class 
    public abstract void insert();
    
    public abstract void cetak();

//    public abstract void delete();
    
    public void setbrand(String br){
        brand = br;
    }
    public String getbrand(){
        return brand;
    }
    public void setwarna(String wr){
        warna = wr;
    }
    public String getwarna(){
        return warna;
    }
    public void setukuran(int uk){
        ukuran = uk;
    }
    public int getukuran(){
        return ukuran;
    }
    public void setharga(String hrg){
        harga=hrg;
    }
    public String getharga(){
        return harga;
    }
    public void setproduct(String pr){
        product = pr;
    }
    public String getproduct(){
        return product;
    }
    public void setkode(String kd){
        kode = kd;
    }
    public String getkode(){
        return kode;
    }
    public void setnmproduct(String nm){
        nmproduct = nm;
    }
    public String getnmproduct(){
        return nmproduct;
    }
    
//    public abstract void insert();
//    
//    public abstract void delete();
//
//    public abstract void cetak();
}
