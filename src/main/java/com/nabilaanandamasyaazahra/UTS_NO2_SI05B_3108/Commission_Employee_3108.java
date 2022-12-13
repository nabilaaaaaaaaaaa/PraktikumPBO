package com.nabilaanandamasyaazahra.UTS_NO2_SI05B_3108;
    public class Commission_Employee_3108 extends Employees_3108 {

    int gajiPokok;
    int komisi;
    int totalPenjualan;

    public Commission_Employee_3108(int gajiPokok, int komisi, int totalPenjualan, String nama, String nip) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalPenjualan = totalPenjualan;
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = gajiPokok + (komisi * totalPenjualan);
        System.out.println("Gaji : " + hitungGaji);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Komisi : " + komisi);
        System.out.println("Total Hasil Penjualan : " + totalPenjualan);

    }

}
