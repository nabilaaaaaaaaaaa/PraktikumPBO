
package com.nabilaanandamasyaazahra.praktikumpbo.polimorfisme;


public class BujurSangkar extends PersegiPanjang {
    public BujurSangkar (double panjang){
 super(panjang, panjang);
 }

 public void display(){
 System.out.println(" Hasil Luas dan Keliling [BujurSangkar]");
 System.out.println("Luas : " + super.luas());
 System.out.println("Keliling : " + super.keliling());
    }
}
