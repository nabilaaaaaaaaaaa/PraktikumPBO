package com.nabilaanandamasyaazahra.praktikumpbo.pertemuan4.tugasbila;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 System.out.println(" === MENU BANGUN DATAR === ");
 System.out.println(" 1. trapesium ");
 System.out.println(" 2. jajargenjang ");
 System.out.println(" 3. segitiga ");
 System.out.println(" 4. Keluar ");
 System.out.print("Masukkan Pilihan : ");
 int pilihan = input.nextInt();
 System.out.println();
 
 // pembuatan object
 Trapesium kb = new Trapesium();
 BangunDatar br = new BangunDatar();
 Segitiga ta = new Segitiga();
 
 // mengisi nilai attribute
 kb.nama = "Trapesium";
 kb.sisi = 6;
 kb.sudut = 8;
 kb.ciriCiri = "60 derajat";

 br.nama = "Jajargenjang";
 br.sisi =6;
 br.sudut = 8;
 
 ta.nama = "Segitiga";
 ta.sisi = 3;
 ta.sudut = 0;
 ta.ciriCiri = "tutup dan tinggi";

 // pemanggilan method
 switch(pilihan){
 case 1:
 kb.hitungLuas();
 kb.showInfo();
 kb.sifat();
 kb.extraInfo();
 break;

 case 2:
 br.hitungLuas();
 br.showInfo();
 break;

 case 3:
 ta.hitungLuas();
 ta.showInfo();
 ta.sifat();
 ta.extraInfo();
 break;

 case 4:
 System.out.println("Silahkan Keluar");
 break;
 }
 }
}
