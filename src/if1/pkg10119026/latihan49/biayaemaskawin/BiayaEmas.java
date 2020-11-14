/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan49.biayaemaskawin;

/**
 *
 * @author Asus
 * NAMA         : Muhammad Khatami
 * KELAS        : IF-1
 * NIM          : 10119026
 * Deskripsi Program : program ini untuk menghitung harga emas
 */
public class BiayaEmas {
    private double emas;
    private double harga;
    private String nama;
    
    public BiayaEmas(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public double getEmas(){
        return emas;
    }
    
    public void setEmas(double emas){
        this.emas = emas;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double totalBayar(double emas, double harga){
        return emas * harga;
    }
}
