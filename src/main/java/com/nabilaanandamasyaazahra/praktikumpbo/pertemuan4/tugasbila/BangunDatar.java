package com.nabilaanandamasyaazahra.praktikumpbo.pertemuan4.tugasbila;
public class BangunDatar {
     // Attribute
 String nama;
 int sisi;
 int sudut;

 // method untuk bangun ruang
 public void hitungLuas(){
 System.out.println("Luas untuk  " + nama +" adalah dengan menghitung perkalian antara sisi sisi nya");
 }

 public void showInfo(){
 System.out.println("Bangun Ruang " + nama + " Memiliki sisi sebanyak : " +
sisi + " dan jumlah titik sudut sebanyak : " + sudut);
 extraInfo();
 }

 // penambahan method
 public void extraInfo(){}
}

