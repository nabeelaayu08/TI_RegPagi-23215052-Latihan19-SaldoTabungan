package SaldoTabungan;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini menampilkan jumlah saldo tabungan setiap bulan dalam 6 bulan.
 */

import java.text.DecimalFormat;

public class SaldoTabungan {
    public static void main(String[] args) {
        // Deklarasi variabel
        double saldoAwal = 2500000;
        double bungaPerBulan = 0.15; // Asumsi bunga 15% per bulan
        int lamaBulan = 6;

        // Format Rupiah
        DecimalFormat formatRupiah = new DecimalFormat("Rp#,###.##");

        // Perhitungan saldo setiap bulan
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            double bunga = saldoAwal * bungaPerBulan;
            saldoAwal += bunga;

            System.out.println("Saldo di bulan ke-" + bulan + " " + formatRupiah.format(saldoAwal));
        }
    }
}
