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
public class IF110119026Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BiayaEmas biayaEmas = new BiayaEmas("Aji Setiawan");
        biayaEmas.setEmas(17);
        biayaEmas.setHarga(2000000);
        double emas = biayaEmas.getEmas();
        double harga = biayaEmas.getHarga();
        System.out.println("Jumlah Emas yang akan di beli : " + emas + " gram");
        System.out.println("Harga Emas Per/Gram : Rp. " + harga);
        System.out.println("Total Bayar : Rp. "  + biayaEmas.totalBayar(emas, harga));
    }
    
}
