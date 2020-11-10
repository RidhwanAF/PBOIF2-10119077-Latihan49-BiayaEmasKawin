/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan49.biayaemaskawin;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fuazan
 * NIM      : 10119077
 * Kelas    : IF - 2
 * Deskripsi: Menampilkan Biaya Emas Kawin
 */
public class PBOIF210119077Latihan49BiayaEmasKawin {

    
    public static void main(String[] args) {
        Emas objEmas = new Emas(15.7, 570000);
        
        System.out.println("Hendi membeli emas kawin dengan total berat = "
                            + ""+objEmas.getBeliEmas()+" gram");
        System.out.printf("Harga emas 1 gram per bulan oktober         = Rp. %.0f\n",objEmas.getHarga());
        System.out.printf("Total yang harus bayar oleh Hendi           = "
                            + "Rp. %.0f\n",objEmas.hitungTotalBayar(objEmas.getBeliEmas(), objEmas.getHarga()));
    }
    
}
