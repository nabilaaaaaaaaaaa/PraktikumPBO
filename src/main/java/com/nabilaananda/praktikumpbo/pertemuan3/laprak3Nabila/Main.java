package com.nabilaananda.praktikumpbo.pertemuan3.laprak3Nabila;

public class Main {
    public static void main(String[] args) {
        // memanggil class Nabila
        Nabila saya = new Nabila ("Ananda", 155, 50, 19);
        Nabila dia = new Nabila ("Masya", 175, 60, 18);
        
        // menjalankan Method
        saya.biodataSaya();
        dia.biodataSaya();
        
        // Menjalankan Getter & Setter dari class Nabila
        System.out.println("Berat badan saya(sebelum workout) : " + dia.getBerat());
        dia.setBerat(50);
        System.out.println("Berat badan saya (setelah workout) : " + dia.getBerat());
        
        System.out.println("\n");
        // menghitung massa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01) * (dia.getTinggi() * 0.01));
        
        System.out.println("Berat Tubuh saya adalah " + massa);
        
        System.out.println("\n");
        
        //Inheritance = menghubungkan dua objek atau lebih
        Try hewan = new Try(); // memanggil class Try
        System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof Try));
        System.out.println("Apakah Ayam adalah Omnivora -> " + (hewan instanceof Tupai));
        System.out.println("------------------------"); // spasi
 
        Tupai Tupai = new Tupai();
        System.out.println("Apakah hewan adalah Objek -> " + (Tupai instanceof Object));
        System.out.println("Apakah Tupai adalah Hewan -> " + (Tupai instanceof Try));
        System.out.println("Apakah Tupai adalah Omnivora -> " + (Tupai instanceof Tupai)); 
    }
}


