package com.nabilaanandamasyaazahra.UTS_NO2_SI05B_3108;
    public class Project_Planner_3108 extends Employees_3108 {

    int gajiPokok;
    int komisi;
    int totalProyek;

    public Project_Planner_3108(int gajiPokok, int komisi, int totalProyek, String nama, String nip) {
        super(nama, nip);
        this.gajiPokok = gajiPokok;
        this.komisi = komisi;
        this.totalProyek = totalProyek;
    }

    @Override
    public void hitungGaji() {
        int hitungGaji = gajiPokok + (komisi * totalProyek);
        System.out.println("Gaji : " + hitungGaji);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIP : " + nip);
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Komisi : " + komisi);
        System.out.println("Total Hasil Proyek : " + totalProyek);

    }

}
