package com.nabilaanandamasyaazahra.UTS_NO2_SI05B_3108;
    public class Salaried_Employee_3108 extends Employees_3108{

    int upahMingguan;

    public Salaried_Employee_3108(int upahMingguan, String nama, String nip) {
        super(nama, nip);
        this.upahMingguan = upahMingguan;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Upah Mingguan : " + upahMingguan);
        
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = upahMingguan;
        System.out.println("Gaji : " + hitungGaji);
    }
}
